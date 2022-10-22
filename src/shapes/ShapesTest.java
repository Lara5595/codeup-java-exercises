package shapes;

import Animals.Bird;

public class ShapesTest {
    public static void main(String[] args) {
        // Commented code for abstract and interfaces excercise
        // this is the inheritance and polymorphism exercise

//        Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("The area of the rectangle is " + rectangle.getArea());
//        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
//
//        Square square = new Square(10);
//        System.out.println("The Area of the square is " + square.getArea());
//        System.out.println("The Perimeter of the square is " + square.getPerimeter());
//
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("The Area of box 1 is " + box1.getArea());
//        System.out.println("The Perimeter of box 1 is " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("The Area of box 2 is " + box2.getArea());
//        System.out.println("The Perimeter of box 2 is " + box2.getPerimeter());
//
//        // Override method
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape = new Square(5,5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Rectangle(3, 4);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());



    } // main
} // rectangle

// Added more notes
