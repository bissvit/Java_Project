package Lab_4;

public class Atelier {
    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда");
        for (Clothes c : clothes) {
            if (c instanceof WomanClothing) {
                ((WomanClothing) c).dressWoman();
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("\nМужская одежда");
        for (Clothes c : clothes) {
            if (c instanceof ManClothing) {
                ((ManClothing) c).dressMan();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Sizes.M, 1500, "синий"),
                new Pants(Sizes.L, 2500, "черный"),
                new Tie(Sizes.S, 1800, "красный"),
                new Skirt(Sizes.XS, 900, "бордовый")
        };

        dressWomen(clothes);
        dressMan(clothes);
    }
}
