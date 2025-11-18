package Lab_4;

public class Skirt extends Clothes implements WomanClothing {
    public Skirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public void dressWoman() {
        System.out.println("Женщина надевает юбку" + this);
    }

}