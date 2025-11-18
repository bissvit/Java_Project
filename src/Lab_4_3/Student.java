package Lab_4_3;

public class Student extends Learner {
    private String faculty;

    public Student(String name, int age, String faculty) {
        super(name, age);
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", возраст: " + age + ", факультет: " + faculty;
    }
}
