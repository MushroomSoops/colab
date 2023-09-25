//let text = "How are you doing today?";
//const myArray = text.split(" ");
//let word = myArray[1];
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        String content = new String(Files.readAllBytes(Paths.get("text.txt")));
        System.out.println(content);
        List<String> textFileArray = new ArrayList<String>(Arrays.asList(content.split(" ")));
        System.out.println("Array List: " + textFileArray);
        System.out.println("Words: " + textFileArray.size());
        String words = textFileArray.toString();
        System.out.println("Characters: " + words.length());
        System.out.println("Average word length: " + words.length()/textFileArray.size() + " characters");
    }
}





