package shapes;

public class Rectangle {

    protected int length;

    protected int width;

    // Getter
    public int getLength() {
        return length;
    }

    // Setter
    public void setLength(int length) {
        this.length = length;
    }

    // Getter
    public int getWidth() {
        return width;
    }

    // Setterr
    public void setWidth(int width) {
        this.width = width;
    }


    // Methods
    public int getArea(){
        return getLength() * getWidth();
    }

    public int getPerimeter(){
        return getLength() * 2 + getWidth()* 2;
    }


    // Constructors

    public Rectangle(){}

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
} // end of Rectangle
