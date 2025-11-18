package Lab_6;

public class Main {
    public static void main(String[] args) {

        Printable[] printables = {
                new Book("Война и мир", "Лев Толстой"),
                new Book("Преступление и наказание", "Фёдор Достоевский"),
                new Shop("Читай-город", "ул. Ленина, 12"),
                new Shop("Буквоед", "пр. Победы, 45")
        };

        System.out.println("Вывод всех объектов, реализующих Printable");
        for (Printable p : printables) {
            p.print();
        }
    }
}
