package shapes;

public class Square extends Quadrilateral {
    protected double length;

    protected double width;




    // Constructors
    public Square(double length, double width) {
        super(length, width);
    }

    // Commented out for Abstract and interface exercise
    // this is the inheritance and polymorphism exercise

//    private int side;
//
//    //  Getter
//    public int getSide() {
//        return side;
//    }
//
//    // Setter
//    public  void setSide( int side) {
//        this.side = side;
//    }
//
//
//    // Methods Override Polymorphism
//    public int getPerimeter(){
//        System.out.println("Square override getPerimeter method ");
////            return 4 * length;
//                return  4 * side;
//    }
//
//    public int getArea(){
//        System.out.println("Square override getArea method");
////            return (int) Math.pow(length,2);
//                return (int) Math.pow(getSide(),2);
//    }
//
//    // end of methods override
//
//
//
//
//
//
//
//    // constructors
//
//    public Square(){}
//
//    // We create a constructor Square with a arg side
//    // We get the set length and width with super and pass it side
//    //    public Square(int side){
//    //        super.setLength(side);
//    //        super.setWidth(side);
//    //    }
//
//    public Square (int side){ // so if you want to override you need to create a new constructor
//        this.setSide(side);
//    }



} // Rectangle
