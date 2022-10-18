package shapes;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Input input = new Input();


        circle.setRadius();
        System.out.printf("The area of the circle is %.2f%n", circle.getArea());
        System.out.printf("The circumference of the circle is %.2f%n", circle.getCircumference());


    }
}
