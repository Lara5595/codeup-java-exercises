public class RecursionLecture {
    // Taught by DocRob


    // Methods

    // Getting the min without recursion
    public static int getMin(int[] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Hallmark1: min(a,n) = smaller of a[n-1] and min (a, n-1)
    // Hallmark2: min(a,1) = a[0]
    // Getting the min with recursion





    // Factorial using recursion
    public static long fact(long n) {
        // hallmark #2 (a way to stop)
        if (n == 1 || n == 2) {
            return n;
        }
        // hallmark #1 ( answer is in smaller terms of itself)
        return n * fact(n - 1);
    }

    // factorial without recursion
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }





    // Fibonacci- it's the sum of the two previous numbers before
    // The recursive definition of fibonacci:
    // fib(n) = fib(n-1) + (fib -2)

    public static long fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);

        // using memoization
//        long fibN = fib(n-1) + fib(n-2);
//        memoTable[n] = fibN;
//        return fibN;
    }



    public static void main(String[] args) {

        System.out.println(fact(5) + " I am a factorial with recursion");
        System.out.println(factorial(5) + " I am factorial without recursion");

        long start = System.currentTimeMillis();
        System.out.println(fib(6));
        System.out.println("Tie in ms = " + (System.currentTimeMillis() - start));

        int arrayTest[] = new int[]{10, 11, 88, 2, 12, 120};
        System.out.println(getMin(arrayTest));





    } // end of main

} // end of recursion
