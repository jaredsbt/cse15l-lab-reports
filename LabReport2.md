# Lab Report 2

'
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
'
# Part 1
![Hello image](images/Hello.png)

1) getPath(), getQuery(), split(), equals(), String.valueOf()
2) getPath() allows us to access the url, getQuery looks at the query paramter, equals makes a comparison between the first user input in the url, String.valueOf allows to typecast int to String to number list of words.

![How are you image](images/HowAreYou.png)
1) replace(), getPath(), getQuery(), split(), equals(), String.valueOf()
2) Replace allows us to replace the "+" added to queries with spaces, getPath() allows us to access the url, getQuery looks at the query paramter, equals makes a comparison between the first user input in the url, String.valueOf allows to typecast int to String to number list of words.


# Part 2)
1) /Users/papaj/.ssh/id_rsa.pub
2) /Users/papaj/.ssh/id_rsa.pub

# Part 3) 
I learned how to make directory with the mkdir command. I learned how to remove the need to enter passphrase when accessing remote computer using ssh-keygen and authorizing keys.  
