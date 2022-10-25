package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        Student mason = new Student("Mason");
        mason.addGrade(95);
        mason.addGrade(90);
        mason.addGrade(99);

        Student aaron = new Student("Aaron");
        aaron.addGrade(75);
        aaron.addGrade(70);
        aaron.addGrade(89);

        Student nazareth = new Student("Nazareth");
        nazareth.addGrade(70);
        nazareth.addGrade(50);
        nazareth.addGrade(100);

        Student david = new Student("David");
        david.addGrade(91);
        david.addGrade(90);
        david.addGrade(79);

        HashMap<String, Student> studentHashMap = new HashMap<>();

        Map<String, Student> studentMap = Map.ofEntries(
                entry("WoodyMas", mason),
                entry("arrongithub",aaron),
                entry("nazarethgithub", nazareth),
                entry("david5595", david)
        );

        studentHashMap.putAll(studentMap);
//        System.out.println(studentHashMap);


        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students: ");


        studentHashMap.forEach((key, student) -> {
            System.out.printf(" |%s| ", key);
        });


        Scanner scanner = new Scanner(System.in);
        System.out.println("What student would you like to see more information on? ");
        String userResponse = scanner.nextLine();
















    } // end of main
} // end of gradesapp







//    Create a map for students and GitHub usernames
//
//        Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//
//        Be creative! Make up GitHub usernames and grades for your student objects

//    Create the command line interface
//
//Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
//
//        After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.