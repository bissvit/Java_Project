package Lab_3;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
                new Employee("Иванов Иван \nИванович", 52345.75),
                new Employee("Петров Петр \nСергеевич", 41320.50),
                new Employee("Сидорова Анна \nВладимировна", 65200.00),
                new Employee("Кузнецов Артём \nВикторович", 37500.90)
        };

        Report.generateReport(staff);
    }
}