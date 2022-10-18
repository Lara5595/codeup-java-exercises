package shapes;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius();
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
    }
}
