package Lab_3;

public class Employee {
    private String Name;
    private double salary;

    public Employee(String fullName, double salary) {
        this.Name = fullName;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return salary;
    }
}