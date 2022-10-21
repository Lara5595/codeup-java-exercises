package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;

    protected double width;

    //Getter
    public double getLength() {
        return length;
    }

    //Setter
    public void setLength(double length) {
        this.length = length;
    }

    //Getter
    public double getWidth() {
        return width;
    }

    //Setter
    public void setWidth(double width) {
        this.width = width;
    }

    // Methods
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    // constructor
    public Quadrilateral(){};
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }



} // end of Quadrilateral
