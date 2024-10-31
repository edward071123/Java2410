package lesson2.work.dev; // <= 告訴大家你在什麼資料夾下, 以src為根目錄的條件下

public class Keybord {
    private String name;

    // 建構子 (跟類別同名稱的方法)
    public Keybord(String name) {
        this.name = name;
    }

    // 顯示物件名稱的方法
    public void devShowObjectName() {
        System.out.println(this.name);
    }
}
