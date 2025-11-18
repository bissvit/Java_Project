package Lab_2;

public class BookTest {
    static void main() {

        Book сthulhu = new Book("Lovecraft", "The Call of Cthulhu", 1926);
        Book hobbit = new Book("Tolkin", "Hobbit", 1937);

        Bookshelf shelf = new Bookshelf(10);
        shelf.addBook(сthulhu);
        shelf.addBook(hobbit);

        System.out.println("Все книги на полке:");
        shelf.showBooks();

        System.out.println("\nСамая ранняя книга:");
        System.out.println(shelf.getEarliestBook().getName() + " (" + shelf.getEarliestBook().getYear() + ")");

        System.out.println("\nСамая поздняя книга:");
        System.out.println(shelf.getLatestBook().getName() + " (" + shelf.getLatestBook().getYear() + ")");

        System.out.println("\nСортировка книг по году издания:");
        shelf.sortByYear();
        shelf.showBooks();
    }
}
