package fileIo;

import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class FileIoPracticeWalkthrough {

    private final static Path PATH = Paths.get("src", "people.txt");

    // Read people.txt
    private static List<String> readLines() {
        List<String> names;
        try {
            names = Files.readAllLines(PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    private static void greetNames() {
        for (String name : readLines()) {
            System.out.printf("%s works at Codeup.%n", name);
        }
    }

    private static void writeLines(List<String> lines) {
        try {
            Files.write(PATH, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

        // greet names
//        greetNames();
//        System.out.println("==================");

        // write to file and replace names...
//        List<String> newNames = Arrays.asList("Cody", "Nikki", "Jordy", "Jay");
//        writeLines(newNames);
//        greetNames();

        // delete name from list...
        deleteName("Jordy");
        greetNames();

    }
















    private static void deleteName(String nameToDelete) {
        List<String> updatedNames = new ArrayList<>();
        for (String name : readLines()) {
            if (!name.equalsIgnoreCase(nameToDelete)) {
                updatedNames.add(name);
            }
        }
        writeLines(updatedNames);
    }

}