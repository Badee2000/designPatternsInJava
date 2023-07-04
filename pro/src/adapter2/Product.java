package adapter2;

public abstract class Product {
    private String name;
    private String brand;
    private int price;

    public Product(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
