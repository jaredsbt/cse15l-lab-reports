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
                emptyString += String.valueOf(count) + ") " + addedWords[1] + "\n";
                return emptyString;
            }
        } 
        return "404 Not Found!";
    }
}   

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
