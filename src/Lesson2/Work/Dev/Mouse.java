package Lesson2.Work.Dev;

public class Mouse {
    private String name;

    // 建構子 (跟類別同名稱的方法)
    public Mouse(String name) {
        this.name = name;
    }

    // 顯示物件名稱的方法
    public void devShowObjectName() {
        System.out.println(this.name);
    }
}
