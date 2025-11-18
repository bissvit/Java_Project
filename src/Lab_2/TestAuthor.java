package Lab_2;

public class TestAuthor {
    public static void main(String[] args) {

        Author lev = new Author("Лев Толстой", "tolstoy@email.com", 'M');

        System.out.println("Имя автора: " + lev.getName());
        System.out.println("Email автора: " + lev.getEmail());
        System.out.println("Пол автора: " + lev.getGender());

        lev.setEmail("new_tolstoy@email.com");
        System.out.println("Новый email автора: " + lev.getEmail());

        System.out.println("Информация об авторе: " + lev.toString());
    }
}
