

import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a String
        String javier = "Javier";

        // converts the object into a number
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));

        // Creating another string but with the same  Javier
        String alsoJavier = "Javier";

        // despite having diffrent variables they have the same hex code which is javier and alsoJavier
        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));


        // changing a string
        javier = javier + " Ruedas";
        alsoJavier = javier;


        System.out.println(alsoJavier);
        System.out.println(javier);

        // The hex codes changes because we change their variables.
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        // This has the same hex code as the first ones since it has the same value. It pointed to the same memory address.  String immutability
        String letsTryThis = "Javier";
        System.out.println(Integer.toHexString((System.identityHashCode(letsTryThis))));


        // Using .equals

        String theOriginalJavier = "Javier";

        System.out.println(letsTryThis == theOriginalJavier);

        System.out.println("What's your name?");
        String userName = scanner.next();
        // this will come out false since we are not using .equals
        System.out.println(theOriginalJavier == userName);
        //  .equals you use it when you compare the strings
        // there is .equals and .equals ignore which just ignore the lowercase
        System.out.println(theOriginalJavier.equalsIgnoreCase(userName));
    }
}