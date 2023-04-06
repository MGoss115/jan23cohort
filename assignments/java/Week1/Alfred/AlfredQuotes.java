import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting(String name) {
        // You do not need to code here, this is an example method
        return "Hello lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello " + name + "." + " Lovely to see you!";
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "it is currently, " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        int name = conversation.indexOf("Alexis");
        int name2 = conversation.indexOf("Alfred");

        if (name != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (name2 != -1) {
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
