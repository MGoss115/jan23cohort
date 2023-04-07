package com.example.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookclub.models.Book;
import com.example.bookclub.models.LoginUser;
import com.example.bookclub.models.User;
import com.example.bookclub.services.BookService;
import com.example.bookclub.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String welcome(HttpSession session, Model model) {
		if(session.getAttribute("user_id") != null) {
			List<Book> books = bookService.allBooks();
			model.addAttribute("books", books);
			
			model.addAttribute("theUser", userService.findUser((Long)session.getAttribute("user_id")));
			return "dashboard.jsp";	
		} else {
			model.addAttribute("newUser", new User());
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
	}
	
	@GetMapping("/add")
	public String createBook(HttpSession session, @ModelAttribute("book") Book book, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "index.jsp";
		} else {
			return "addBook.jsp";
		}
	}
	
	@PostMapping("/newbook") 
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "addBook.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession 	session) {
		userService.register(newUser, result);
		if(result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		} else {
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
		User user = userService.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        } else {
        	 session.setAttribute("user_id", user.getId());
        	 return "redirect:/dashboard";
        	
        }
    }
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}
