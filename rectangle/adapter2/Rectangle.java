package rectangle.adapter2;

public class Rectangle {
    
    private int width;
    private int height;

    public Rectangle(int w, int h)
    {
        width = w;
        height = h;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getArea()
    {
        return this.width * this.height;
    }
}
