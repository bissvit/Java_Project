package Lab_2;

import java.util.ArrayList;

public class DogTest {

    ArrayList<Dog> pitomnik = new ArrayList<Dog>();

    public void addDog(Dog dogs) {
        pitomnik.add(dogs);
    }

    static void main() {

        DogTest test = new DogTest();

        Dog bublik = new Dog("Bublik", 2);
        Dog persik = new Dog("Persik", 1);
        Dog laika = new Dog("Laika", 4);

        test.addDog(bublik);
        test.addDog(persik);
        test.addDog(laika);

        laika.setName("strelka");

        for(Dog dogs : test.pitomnik) {
            System.out.println(dogs);
        }

        System.out.println(persik.getName());
        System.out.println(bublik.getAge());

    }
}