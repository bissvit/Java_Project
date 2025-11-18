package Lab_3;
import java.util.Formatter;
public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-20s %5s%n", "ФИО", "Зарплата");
        Formatter fmt = new Formatter();
        for (Employee emp : employees) {
            //System.out.printf("%-25s %15.2f%n", emp.getName(), emp.getSalary());
            System.out.print(fmt.format("%-25s %15.2f%n", emp.getName(),emp.getSalary()));
        }
    }
}