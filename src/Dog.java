public class Dog {

    public static String bark() {
//        System.out.println("Woof woof!");
        return "Woof woof!";
    }

    // You cannot return  ^^ with a void so when change it to String

    //  Method Overloading
    public static void bark(int weight) {
    if (weight < 25){
        System.out.println("Yip yip");
    } else {
        System.out.println("Woof woof");
    }
    }

//     public static void bark(int weight, String name) {
//         System.out.printf("%s", name);
//     }


    // you can have more than 1 bark
    public static  void bark(int weight, String name) {
        String output = name + " goes ";
        if (weight < 25) {
            output += "yip yip";
        } else {
            output += "woof woof";
        }
        System.out.println(output);
    }


    public static void main(String[] args) {
        System.out.println(bark()); // This is because of the return
//        bark();
//        bark(15);
//        bark(50);
//        bark(50,"Rudo");
//        bark(15, "Fido");
    }




}
