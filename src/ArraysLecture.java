import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {

        int [] numbers;
           numbers = new int[5]; // we create the array with how many it will have
        numbers[0] = 78;
        numbers[1] = 253;
        numbers[2] = -23;       // we have to input the numbers one by one
        numbers[3] = -789;
        numbers[4] = 36;
        System.out.println(numbers[0]);  // We will get 78
        Arrays.sort(numbers);  // but when we sort we will get
        System.out.println(numbers[0]); // -789
        System.out.println(Arrays.toString(numbers)); // this consoles the whole array


        String [] wordsForWeird = {"strange", "bizarre", "uncanny", "odd", "peculiar", "weird"}; // Creating a array of strings
        System.out.println(wordsForWeird[2]);
//        System.out.println(Arrays.toString(wordsForWeird)); // this console the whole array

        for (String wordForWeird : wordsForWeird) {   // this loops the whole array one by one
            System.out.println(wordForWeird);
        }

//        for (int number : numbers) {        // this loops through the whole numbers array also
//            System.out.println(number);
//        }

        for (int i = 0; i < numbers.length; i++) {          // This is a for loop that loops through the array also
            System.out.printf("The number at index %d is %d%n ", i, numbers[i]);
        }





    } // end of main
} // end of arrays
