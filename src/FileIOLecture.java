import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {

        // ============================ PATH

        // src/filIoLecture/test.txt    This is the equivalent to the one in the bottom
//        Path pathToTest = Paths.get("src", "fileIoLecture", "test.txt");
//        System.out.println(pathToTest);
//
//        Path pathToWeywot = Paths.get("src" ,"hello", "weywot.txt");
//        System.out.println(pathToWeywot);


        // There are two types of paths:
        //
        //absolute paths: specified from the filesystem root
        //relative paths: relative to the current working directory

        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.java");
        Path gitignoreFile = Paths.get(".gitignore"); // created a file
        Path pathToWeywot = Paths.get("src", "weywot", "java", "weywot.txt"); // we do not have weywot so it will come out false
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture");
//        System.out.println(otherPath);
//        // .. goes up the directory
//        System.out.println(otherPath.normalize());
//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

        // ============================ FILE METHODS

        System.out.println(Files.exists(fileLecturePath)); // Tells you if the file exist with true or false
        System.out.println(Files.exists(gitignoreFile));  // Returns true since we created path
        System.out.println(Files.exists(pathToWeywot));
        System.out.println(Files.exists(Paths.get("bob.txt")));
//
        String directory = "data";
        String filename = "info.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
//
        System.out.println(dataDirectory);
        System.out.println(dataFile);
//

//        if (Files.notExists(dataDirectory)) {   // This creates the data file
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
////
//        if (Files.notExists(dataFile)) {  // this creates the file in data directory
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // ============================ READING FILES

        Path p = Paths.get("src","test.txt");

//         This returns a ArrayList
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(lines);
//
        // This iterates thorough the array list and prints Hello + name from array
        for (String name : lines) {
            System.out.println("Hello, " + name + "!");
        }



//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
     //   }



        // ============================ WRITING FILES

//        Path p = Paths.get("src", "test.txt");


//         This adds names to the test.txt
//         If we remove StandardOpenOption.APPEND it replaces the names instead of adding

//        List<String> newNames = Arrays.asList("David", "Fernando", "Mason");
//        try {
//            Files.write(p, newNames, StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//        // This is another way to add people
//
//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }


    } // end of main
} // End of FileIoLecture


