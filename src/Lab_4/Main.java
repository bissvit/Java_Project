package Lab_4;

public class Main {
    static void main() {
        Season.Seasons favorite = Season.Seasons.AUTUMN;
        getFavorite(favorite);
        for (Season.Seasons s : Season.Seasons.values()) {
            System.out.println(s + ": температура " + s.getTemp() + ", " + s.getDescription());
        }
        }

    public static void getFavorite(Season.Seasons favorite) {
        switch (favorite) {
            case SUMMER -> {
                System.out.println("Я люблю лето");
                break;
            }
            case AUTUMN -> {
                System.out.println("Я люблю осень");
                break;
            }
            case SPRING -> {
                System.out.println("Я люблю весну");
                break;
            }
            case WINTER -> {
                System.out.println("Я люблю зиму");
                break;
            }
        }

    }
}


