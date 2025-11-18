package Lab_4_3;

public class SchoolStudent extends Learner {
    private String className;

    public SchoolStudent(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    @Override
    public String toString() {
        return "Школьник: " + name + ", возраст: " + age + ", класс: " + className;
    }
}
