package AssesmentPractice;
//1. Create a class called Practice with a main method.

public class Practice {

    //        2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int num) {
        return num - 10;
    }

    //        3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.

    // Whenever a variable/argument/parameter is declared (which means that it's established as a variable), in Java, unlike JS you must __establish a data-type!!:)__
    // Total / length 8, 9, 10, 2, 5 /5 => avg

    public static double average(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        return (double) total/array.length;
    }



    public static void main(String[] args) {
    int[] testArr = {8, 9, 10, 2, 5}; // array for #3

        System.out.println(subtractTen(20));
        System.out.println(average(testArr));

    } // Main
} // Practice


