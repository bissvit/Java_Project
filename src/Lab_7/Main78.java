package Lab_7;

public class Main78 {
        static void main() {
            Printable[] arr = {
                    new Book("Книга 1"),
                    new Magazine("Журнал 1"),
                    new Book("Книга 2"),
                    new Magazine("Журнал 2")
            };

            System.out.println("Только книги");
            Book.printBooks(arr);

            System.out.println("\nТолько журналы");
            Magazine.printMagazines(arr);
        }

}

