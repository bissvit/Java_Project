package Lab_3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    static void main() {
        int size = 5;
        double[] mass_math = new double[size];
        System.out.println("Массив метода random()");
        for (int i = 0; i < size; i++) {
            mass_math[i] = Math.random();
            System.out.print(mass_math[i] + ", ");
        }
        System.out.println("\nОтсортированный массив метода random()");
        Arrays.sort(mass_math);
        for (int j = 0; j < size; j++) {
            System.out.print(mass_math[j] + ", ");
        }

        Random rand = new Random();
        System.out.println("\nМассив класса Random");
        double[] mass_class = new double[size];
        for (int i = 0; i < size; i++) {
            mass_class[i] = rand.nextDouble();
            System.out.print(mass_class[i] + ", ");
        }
        System.out.println("\nОтсортированный массив класса Random");
        Arrays.sort(mass_class);
        for (int j = 0; j < size; j++) {
            System.out.print(mass_class[j] + ", ");
        }

    }
}
