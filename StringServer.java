aimport java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    List<String> listWords = new ArrayList<String>()

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Word: %d", emptyString);
        } 
        
        else if (url.getPath().contains("/add-message")) {
            String[] addedWords = url.getQuery().split("=");
                if (addedWords[0].equals("s")) {
                    listWords.add(addedWords[1]);
                    for(int i = 0; i < listWords.length; i++) {
                        (i+1). System.out.println(listWords[i])
                    }
                }
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
