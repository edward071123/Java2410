package Lesson2;
// import Lesson1.Person;
import Lesson1.*;
// import Lesson2.More.Pen;
// import Lesson2.More.Mouse;
// import Lesson2.More.Keybord;
import Lesson2.More.*;

// import Lesson2.dev.one.Animal;
// import Lesson2.test.one.Animal;

public class Demo {
    public static void main(String[] args) {
        // Person person1 = new Person("Edward");
        // person1.showName();

        // Lesson2.dev.one.Animal animal1 = new Lesson2.dev.one.Animal();
        // Lesson2.dev.one.Animal animalDev = new Lesson2.dev.one.Animal();
        // animalDev.name = "dev";
        // animalDev.showDevName();

        // Lesson2.test.one.Animal animalTest = new Lesson2.test.one.Animal();
        // animalTest.name = "test";
        // animalTest.showTestName();


        // Pen pen = new Pen();
        // Mouse mouse = new Mouse();
        // Keybord keybord = new Keybord();


        Bank myBank = new Bank();
        // myBank.setMoney(1000);
        // int myMoney = myBank.getMoney();

        myBank.saveMoney("edward071123", "123123", 100);
        int myMoney = myBank.atmShowMyMoney("edward071123", "123123");
        System.out.println("顯示餘額:" + myMoney);

    }
}
