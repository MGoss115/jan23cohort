package com.example.fullstacklecture.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.fullstacklecture.models.LoginUser;
import com.example.fullstacklecture.models.Puppy;
import com.example.fullstacklecture.models.User;
import com.example.fullstacklecture.services.PuppyServ;
import com.example.fullstacklecture.services.UserServ;

@Controller
public class HomeController {

	@Autowired
	private UserServ userServ;
	
	@Autowired
	private PuppyServ pupServ;
	
	
    // ==========================
    //      MAIN FUNCTIONS
    // ==========================
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/logReg")
	public String logReg(HttpSession session, Model model) {
		if(session.getAttribute("user_id") != null) {
			return "redirect:/dashboard";
		} else {
	        // Bind empty User and LoginUser objects to the JSP
	        // to capture the form input
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());

		return "logReg.jsp";
		}
	}
	
	
    // ==========================
    //      LOGREG FUNCTIONS
    // ==========================
	
   // Create User Process
   @PostMapping("/register")
   public String registerUser(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
   	userServ.register(newUser, result);
       if(result.hasErrors()) {
           model.addAttribute("newLogin", new LoginUser());
           return "logReg.jsp";
       }
       session.setAttribute("user_id", newUser.getId());
       return "redirect:/dashboard";
   }
   
   // Login User Process
   @PostMapping("/login")
   public String loginUser(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
       User user = userServ.login(newLogin, result);
       if(result.hasErrors()) {
           model.addAttribute("newUser", new User());
           return "logReg.jsp";
       }
       session.setAttribute("user_id", user.getId());
       return "redirect:/dashboard";
   }
   
   // Logout User
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
    // ==========================
    //      PUPPY FUNCTIONS
    // ==========================
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, @ModelAttribute("puppy") Puppy puppy, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logReg";
		} else {
		model.addAttribute("theUser", userServ.getUser((Long)session.getAttribute("user_id")));
		model.addAttribute("allPups", pupServ.getAll());
		return "dashboard.jsp";
		}
	}
	
	@GetMapping("/addPuppy")
	public String addPuppy(@ModelAttribute("savePuppyForm") Puppy pup, Model model) {
		
		return "addPuppy.jsp";
	}
	
	@PostMapping("/saveThePuppy")
	public String saveThePuppy(@Valid @ModelAttribute("savePuppyForm") Puppy pup, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "addPuppy.jsp";
		} else {
			pupServ.savePup(pup);
			return "redirect:/dashboard";
		}
	}
}
