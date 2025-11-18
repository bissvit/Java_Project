package Lab_4;

public class Pants extends Clothes implements ManClothing, WomanClothing {
    public Pants(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина надевает штаны" + this);
    }
    public void dressWoman() {
        System.out.println("Женщина надевает штаны" + this);
    }

}