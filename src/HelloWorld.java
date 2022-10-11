// all java code live inside class
public class HelloWorld {
    // type "main and then press tab" it will give you the following below on line 4
    public static void main(String[] args) {
        // type "sout and then press tab"
        System.out.println("Hello World!");


        /////////////Assignment///////////////////////////////////
        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 5;
        System.out.println("My favorite number is # " + myFavoriteNumber);

        // 2.Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello from Java";
        System.out.println(myString);

        // 3. Change your code to assign a character value to myString. What do you notice?
//        char newString = "s";
//        System.out.println(newString);
        // error java: incompatible types: java.lang.String cannot be converted to char

        // 4. Change your code to assign the value 3.14159 to myString. What happens?
//         String myString = "3.14159";
//         System.out.println(myString);

        // 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber;
        // System.out.println(myNumber);
        // I get java: variable myNumber might not have been initialized

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        myNumber = (long) 3.14;
        // It says that i have to cast a long

        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;

        // 8. Change your code to assign the value 123 to myNumber.
        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        myNumber = 3.14;

        // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14F;
        // or change float to a double to fix it


        // 10. Copy and paste the following code blocks one at a time and execute them
        // What is the difference between the above code blocks? Explain why the code outputs what it does.

        // This code block in incrementing i get an output of 5, and then  6
        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        // This code block in incrementing also but i get an output of 6 and then 6
//          int x = 5;
//          System.out.println(++x);
//          System.out.println(x);

        // 11. Try to create a variable named class. What happens?
//        String class;
        // I get a error saying its not a statement

        // 12.Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        // error Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:68)

        //        int three = (int) "three";
        // error java: incompatible types: java.lang.String cannot be converted to int

        // 13. Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;

        // shorhand
        int x = 4;
        x += 5;
        System.out.println(x);

        // 2.
//        int x = 3;
//        int y = 4;
////        y = y * x;
////        // shorthand
//        y *=x;
//        System.out.println(y);


        //3.
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        //shorthand
//        y -= (x / y);
//        System.out.println(y);



        // 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type

        int maximunInteger = Integer.MAX_VALUE;
        System.out.println(maximunInteger);

    }
}
