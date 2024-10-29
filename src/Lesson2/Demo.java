package Lesson2;
import Lesson1.Person;
import Lesson2.dev.one.Animal;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person("Edward");
        person1.showName();

        // Lesson2.dev.one.Animal animal1 = new Lesson2.dev.one.Animal();
        Animal animal1 = new Animal();
        animal1.name = "dog";
        animal1.showName();
    }
}
