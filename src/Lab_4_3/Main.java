package Lab_4_3;

public class Main {
    public static void main(String[] args) {

        Learner[] learners = {
                new SchoolStudent("Иван Иванов", 15, "9А"),
                new SchoolStudent("Мария Иванова", 14, "8Б"),
                new Student("Алексей Иванов", 19, "Факультет информатики"),
                new Student("Ольга Иванова", 20, "Факультет химии")
        };

        System.out.println("Все учащиеся");
        for (Learner l : learners) {
            System.out.println(l);
        }

        System.out.println("\nТолько школьники");
        for (Learner l : learners) {
            if (l instanceof SchoolStudent) {
                System.out.println(l);
            }
        }

        System.out.println("\nТолько студенты");
        for (Learner l : learners) {
            if (l instanceof Student) {
                System.out.println(l);
            }
        }
    }
}
