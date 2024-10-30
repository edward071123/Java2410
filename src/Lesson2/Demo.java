package Lesson2;

// import Lesson1.Person; <= 引用Lesson1下的Person類別
import Lesson1.*; // <= 引用Lesson1下的所有類別(Person, Car)

public class Demo {
    public static void main(String[] args) {
        // ================================== 有無import範例
        // ==================================
        System.out.println("============================================================");
        // 簡化實體化路徑 (有import)
        Person person1 = new Person("EdwardImportPath");
        person1.showName();

        // 完整實體化路徑 (無import)
        Lesson1.Person person2 = new Lesson1.Person("EdwardFullPath");
        person2.showName();

        // 簡化實體化路徑 (有import)
        Car car1 = new Car("001", "blue", false, 10);
        car1.showCarInfo();

        System.out.println("============================================================");
        // ================================= 有無import範例 =================================

        // ============================ 呼叫不同資料夾同名稱Class範例 ============================
        // 開發
        Lesson2.Work.Dev.Keybord keybord1 = new Lesson2.Work.Dev.Keybord("開發-機械鍵盤");
        keybord1.devShowObjectName();

        Lesson2.Work.Dev.Mouse mouse1 = new Lesson2.Work.Dev.Mouse("開發-無聲滑鼠");
        mouse1.devShowObjectName();

        // 測試
        Lesson2.Work.Test.Keybord keybord2 = new Lesson2.Work.Test.Keybord("測試-機械鍵盤");
        keybord2.testShowObjectName();

        Lesson2.Work.Test.Mouse mouse2 = new Lesson2.Work.Test.Mouse("測試-無聲滑鼠");
        mouse2.testShowObjectName();

        System.out.println("============================================================");
        // ============================ 呼叫不同資料夾同名稱Class範例 ============================

        // ===================================== 封裝範例 ====================================
        Bank myBank = new Bank();

        // 第一次存錢
        myBank.setMoney("edward071123", "123123", 1000);

        // 第一次查詢餘額
        myBank.getMoney("edward071123", "123123");

        // 第二次存錢
        myBank.setMoney("edward071123", "123123", 2000);

        // 第二次查詢餘額
        myBank.getMoney("edward071123", "123123");

        // 第三次存錢, 帳密錯誤
        myBank.setMoney("edward071123", "1231235", 2000);

        // 第三次查詢餘額, 帳密錯誤
        myBank.getMoney("edward0711232", "123123");

        // 第四次存錢, 帳密錯誤
        myBank.setMoney("edward0711232", "1231235", 2000);

        // 第四次存錢 (已累積輸入錯誤, 被封鎖)
        myBank.getMoney("edward071123", "123123");

        System.out.println("============================================================");
        // ===================================== 封裝範例 ====================================

    }
}
