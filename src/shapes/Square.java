package shapes;

public class Square extends Rectangle {

    private int side;

    // Getter
    public  int getSide( int side) {
        return side;
    }

    // Setter
    public  void setSide() {
        this.side = side;
    }


    // Methods Override Polymorphism
    public int getPerimeter(){
        System.out.println("Square override getPerimeter method ");
        return  4 * side;
    }

    public int getArea(){
        System.out.println("Square override getArea method");
        return (int) Math.pow(2,side);
    }

    // end of methods override







    // constructors

    public Square(){}

    // We create a constructor Square with a arg side
    // We get the set length and width with super and pass it side
    public Square(int side){
        super.setLength(side);
        super.setWidth(side);
    }

} // Rectangle
