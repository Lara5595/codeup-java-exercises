package shapes;

import java.util.Scanner;
import util.Input;

public class Circle {
    Scanner scanner = new Scanner(System.in); // Import it Scanner
    private static double radius;  // Created a private Radius


    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
//    public void setRadius() {
//        System.out.println("Enter a radius: ");
//        double userDouble = scanner.nextDouble();
//        Circle.radius = userDouble;
////        return userDouble;
//    }
    public void setRadius() {
        System.out.println("Enter a radius: ");
        double userDouble = scanner.nextDouble();
        Circle.radius = userDouble;
//        return userDouble;
    }



    // Methods
    public Circle(double radius){
        this.radius = radius;
        //this.PI = PI
    }



    // Get Area
    public double getArea() {
        return Math.PI * (Math.pow(Circle.radius,2));
    }


    // Get Circumference
    public double getCircumference() {
        return 2 * Math.PI * Circle.radius;
    }



    // Constructor
    public Circle(){
//        scanner = new Scanner(System.in);
    }


} // End of circle

// Inside of src, create a package named shapes. Inside of shapes, create a class named Circle. This class should have a private radius field that is set through the constructor, and various methods for getting information about the circle, detailed below.
