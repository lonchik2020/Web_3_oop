package shapes;

public class Square extends Shape{

    private int length;

    public Square(int x, int y, String color, boolean visible, int length) {
        super(x, y, color, visible);
        this.length = length;
    }



    @Override
    double getArea() {
        return length*length;
    }

    @Override
    double getParameter() {
        return length*4;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void drawing() {
        System.out.println("Drawing square");
    }
}
