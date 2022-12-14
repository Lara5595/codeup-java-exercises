package AssesmentPractice;
//1. Create a class called Practice with a main method.

import java.util.ArrayList;
import java.util.List;

public class Practice {

    //        2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int num) {
        return num - 10;
    }

    //        3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.

    // Whenever a variable/argument/parameter is declared (which means that it's established as a variable), in Java, unlike JS you must __establish a data-type!!:)__
    // Total / length 8, 9, 10, 2, 5 /5 => avg

    public static double average(int[] array){
        double total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total /array.length;
    }

    //        12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.


    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers){
        ArrayList<Integer> newNumbersArrayList = new ArrayList<>();
        for (int number : numbers){
            newNumbersArrayList.add(number * multiplier);
        }
            return newNumbersArrayList;
    }


    public static void main(String[] args) {
    int[] testArr = {8, 9, 10, 2, 5}; // array for #3
    int[] numbers = {5, 10, 15};

        System.out.println(subtractTen(20));
        System.out.println(average(testArr));
        System.out.println(average(numbers));

        //#12
        for (int number : multiplyAll(5, new ArrayList<>(List.of(5, 10, 15, 25, 30)))){
            System.out.println(numbers);
        }


    } // Main
} // Practice






// 1. Create a class called Practice with a main method.
//2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
//3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
//4. Create a class called Pet with two String instance variables, name and type.
//5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
//6. Create a PetDog class that inherits from Pet.
//7. In PetDog, create a boolean instance variable, trained.
//8. Write a constructor for PetDog that sets its name, type, and trained properties.
//9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
//10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.