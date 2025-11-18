package Lab_4;

public class TShirt extends Clothes implements ManClothing, WomanClothing {
    public TShirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина надевает футболку" + this);
    }
    public void dressWoman() {
        System.out.println("Женщина надевает футболку" + this);
    }

}
