import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {
    public static void main(String[] args) {
        Path p = Paths.get("src", "fileIo", "people.txt"); // This is the path to people.txt
        List<String> names = new ArrayList<>(); // This creates the ArrayList names
//        System.out.println(Files.exists(p)); // Tells you if the file exist with true or false

//        names.add("Justin");
//        names.add("Javier");
//        names.add("Jason");
//        names.add("Laura");
//
//         try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

         // I added the names to people.txt ^^^



        // This loop through the names
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names);

        // This loops through the name and adds works at codeup
        for (String name : names) {
            System.out.println( name + " works at Codeup.");
        }



        // This replaces the names

                List<String> newNames = Arrays.asList("David", "Fernando", "Mason", "Arron");
        try {
            Files.write(p, newNames);
        } catch (IOException e) {
            e.printStackTrace();
        }





    } // end of main
} // end of FileIoPractice









//================================= FILE IO MINI-EXERCISE
//
//        - create a class called `FileIoPractice` with a main method
//
//        - add a `fileIo` folder to the root of your codeup-java-exercises project.
//
//        - within this folder, add a text file, `people.txt`.
//
//        - add the following contents to the file:
//
//        Justin
//        Javier
//        Jason
//        Laura
//
//        - write code in the main method that prints the following messages:
//
//        "Justin works at Codeup."
//        "Javier works at Codeup."
//        "Jason works at Codeup."
//        "Laura works at Codeup."
//
//        - create an array list of first names of four other people in your cohort
//
//        - add code to your main method that replaces the contents of `people.txt` with your classmates by writing to the file
//
//        - BONUS: create a static method, `deleteEntry`, that takes in the name of someone (a string) and when invoked, rewrites a new list to the `people.txt` file
//        with all entries except the passed in name








