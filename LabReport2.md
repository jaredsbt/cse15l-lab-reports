# Lab Report 2

# Part 1
![Hello image](images/Hello.png)

1) The public string method, handleRequest
2) HandleRequest is called with an URI as its arguement, and it looks at the string input after the "=" in the uri path. This string is concatenated with the Handler class's string field, emptyString, intialized with an empty string. The emptyString field concatenates the string following "add-message?s=", and the counter field is a of type integer that keeps track of the amount of times the server loads a new URI request starting at count 1.  along with an integer field called counter, is mutable every time the server loads a new uri path with a string following "add-message?s=".
4) The value is changed by concatenating the string after "add-message?s=" within the uri path. It does not matter if the request is meant to be an integer (123) or a double (1.23), the requests are treated as strings. These strings are then listed with counter (which kept track of the amount of requests) by conctatenating counter along with ")" and a new line "\" to emptyString.

![How are you image](images/HowAreYou.png)
1) replace(), getPath(), getQuery(), split(), equals(), String.valueOf()
2) Replace allows us to replace the "+" added to queries with spaces, getPath() allows us to access the url, getQuery looks at the query paramter, equals makes a comparison between the first user input in the url, String.valueOf allows to typecast int to String to number list of words.


# Part 2)
1) /Users/papaj/.ssh/id_rsa.pub
2) /Users/papaj/.ssh/id_rsa.pub

# Part 3) 
I learned how to make directory with the mkdir command. I learned how to remove the need to enter passphrase when accessing remote computer using ssh-keygen and authorizing keys.  

# Code

import java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    String emptyString = "";
    int count = 1 ;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "Nothing";
        } 
        
        else if (url.getPath().contains("/add-message")) {
            String[] addedWords = url.getQuery().split("=");
            if (addedWords[0].equals("s")) {
                emptyString += String.valueOf(count) + ". " + addedWords[1] + "\n";
                emptyString = emptyString.replace("+", " ");
                count += 1;
                return emptyString;
            }
        } 
        return "404 Not Found!";
    }
}   

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
