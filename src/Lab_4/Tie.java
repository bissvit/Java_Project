package Lab_4;

public class Tie extends Clothes implements ManClothing {
    public Tie(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина надевает галстук" + this);
    }

}
