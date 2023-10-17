aimport java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    List<String> listString = new ArrayList<String>();
    String emptyString = ""
    List<String> searchWords = new ArrayList<String>(); 

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Word: %d", emptyString);
        } 
        
        else if (url.getPath().contains("/search")) {
            String[] searchedWords = url.getQuery().split("=");
                if (searchedWords[0].equals("s")) {
                    for (int i = 0; i < listString.size(); i++) {
                        if listString[i].contains(searchedWords[1]) {
                            searchWords.add(word);
                        }
                    }
                    return searchWords;
                }
            }
        } 

        else {
            if (url.getPath().contains("/add")) {
                String[] addedWords = url.getQuery().split("=");
                if (addedWords[0].equals("s")) {
                    listStrings.add(addedWords[1]);
                    return listStrings;
                }
            }
            return "404 Not Found!";
        }
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
