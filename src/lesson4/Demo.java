package lesson4;

import lesson4.furnitures.Fridge;
import lesson4.furnitures.Oven;
import lesson4.pets.SpecialDog;

public class Demo {
    public static void main(String[] args) {
        // ================================== 抽象&介面範例1開始 ================================
        System.out.println("============================================================");
        SpecialDog spDog1 = new SpecialDog();
        spDog1.eat();
        spDog1.sleep();
        spDog1.catchTheBall();
        // ================================== 抽象&介面範例1結束 ================================


        // ================================== 抽象&介面範例2開始 ================================
        System.out.println("============================================================");
        Fridge fridge = new Fridge("Big");
        fridge.preserveFoods();
        fridge.usePower();
        fridge.refrigerate();
        fridge.showSize();

        System.out.println("============================================================");

        Oven oven = new Oven();
        oven.usePower();
        oven.heatFood();
        // ================================== 抽象&介面範例2結束 ================================

        System.out.println("============================================================");
    }

}
