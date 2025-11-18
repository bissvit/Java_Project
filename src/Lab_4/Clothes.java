package Lab_4;

public class Clothes {
    private Sizes size;
    private int price;
    private String color;

    public Clothes(Sizes size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return " — размер: " + size + " (" + size.getEuroSize() + ", " + size.getDescription() + "), цвет: " +
                color + ", цена: " + price + " руб.";
    }

}
