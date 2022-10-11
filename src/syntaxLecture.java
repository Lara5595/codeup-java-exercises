public class syntaxLecture {
    public static void main(String[] args) {
        // Declare variable without inializing
        int weight;
        String breed;
        // Initializing after declaration
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
        // Initialize and declare at the same time
        String name = "Grinch";
        int cutenessFactor = 10;
        // Statement: " JVM, do something"
        System.out.println(name + " is a " + breed + ".");
        // Conditional logic
        if (cutenessFactor > 8) {
            System.out.println(name + " is cute.");
        } else {
            System.out.println(name + " needs to work on cuteness.");
        }
        // Assigning a boolean
        boolean isGrinchCute = true;
        // char
        char oneLetter = 'a';

        // small,medium,number, bignumber
        byte smallNumber; //  bytes -128 to 127
        short mediumNumber; // shorts go from -32768 to 32767
        int number; // integers go c. -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        // You have to put a L after declaring a long number
        bigNumber = 9000000000000L;

        // float and double
        // for float you have to write a F at the end
        float imafloat = 2.34F;
        double imadouble = 9.01234567890123;
        System.out.println(imadouble);
        // casting is converting 1 data type into another in this case where casting float on the bottom
        imafloat = (float) imadouble;
        System.out.println(imafloat);

    }
}
