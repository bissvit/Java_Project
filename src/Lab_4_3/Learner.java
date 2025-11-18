package Lab_4_3;

public class Learner {
    String name;
    int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Учащийся: " + name + ", возраст: " + age;
    }
}