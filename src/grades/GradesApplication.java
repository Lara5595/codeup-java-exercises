package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        // Creating Students with grades

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

        // Creating a Hashmap for students
        HashMap<String, Student> studentUserNames = new HashMap<>();

        // Creating github Usernames
        Map<String, Student> studentMap = Map.ofEntries(
                entry("WoodyMas", mason),
                entry("arrongithub",aaron),
                entry("nazarethgithub", nazareth),
                entry("david5595", david)
        );

        // Puts the hashmap into studentsHashMap
        studentUserNames.putAll(studentMap);

//        System.out.println(studentHashMap);


        Scanner scanner = new Scanner(System.in);


        // I used the Bob function to create the while loop

        String goAgain = "y";  // Created this so when the user answer yes it continues
        while (goAgain.equalsIgnoreCase("y")) {  // while the user enter yes go again
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students: ");

            studentUserNames.forEach((key, student) -> {
                System.out.printf(" |%s| ", key);
            });

            System.out.printf("%n%nWhat student would you like to see more information on? ");
            String userAnswer = scanner.nextLine();

            if (studentMap.containsKey(userAnswer)) {
                Student selectedStudent = studentUserNames.get(userAnswer);
                System.out.printf("%s - GitHub Username: %s %.2f%n", selectedStudent.getName(), userAnswer, selectedStudent.getGradeAverage());
            } else {
                System.out.println("WhatEver");
            }

            System.out.println("Do you want to continue?");
            goAgain = scanner.next();
            scanner.nextLine();















    } // end of main
}
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