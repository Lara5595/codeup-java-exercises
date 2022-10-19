import rpg.Monster;

import java.util.Arrays;


public class ArraysExercisesTest {


    public static void main(String[] args) {
       Person person1  = new Person("David");
       Person person2 = new Person("Fernando");
       Person person3 = new Person("Mason");


        // 1.  What happens when you run the following code? Why is Arrays.toString necessary?
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        // It gives me the hex ^ on the array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        // Array.toString gives you ^ the whole array instead of the hex


       // Create an array that holds 3 Person objects. Assign a new instance of the             Person class to each element. Iterate through the array and print out   the name of each person in the array.

        Person[] people = {person1, person2, person3};
        for (Person persons : people ) {
            System.out.println(persons);
        }


        // Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        Person [] people2 = Person.addPerson(people, new Person("Javier"));
        for (Person person : people2) {
            System.out.println(person);
        }

        Person [] people3 = Person.addPerson(people2, new Person("Gonzalo"));
        for (Person person : people3) {
            System.out.println(person);
        }
        // we know have Javier and Gonzalo in the new array

// 2. Server Name Generator
        // We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
        //
        //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
        //Create a method that will return a random element from an array of strings.
        //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.





    } // end of main
}
