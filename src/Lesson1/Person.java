package Lesson1;
class Person {
    public String personName;
    public static int personCount = 0; // 靜態變數宣告

    // 建構子
    public Person(String name) {
        this.personName = name;
        personCount++;
    }

    public void showName() {
        System.out.println("pserson name is " + personName);
    }

    // 靜態方法印出count
    public static void callCountWithStatic() {
        System.out.println("Total persons is " + personCount);
    }
}
