package rectangle.adapter2;

public class Square implements ISquare{

    private Rectangle rec;

    public Square(int side)
    {
        rec = new Rectangle(side, side);
    }

    public void setSide(int side) {
        rec.setHeight(side);
        rec.setWidth(side);
    }

    public void printArea() {
        System.out.println(rec.getArea());
    }
    
}
