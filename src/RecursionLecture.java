public class RecursionLecture {
    // Taught by DocRob


    // Methods
    // Factorial using recursion
    public static long fact(long n) {
        // hallmark #2 (a way to stop)
        if (n == 1 || n == 2) {
            return n;
        }
        // hallmark #1 ( answer is in smaller terms of itself)
        return n * fact(n - 1);
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
    }


    public static void main(String[] args) {

        System.out.println(fact(5) + " I am a factorial");

        long start = System.currentTimeMillis();
        System.out.println(fib(30));
        System.out.println("Tie in ms = " + (System.currentTimeMillis() - start));




    } // end of main

} // end of recursion
