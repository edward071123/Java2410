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

    // // 封裝回傳name
    // public String getName(String car) {
    //     return this.personName + " have a " + car + " car";
    // }

    // 靜態方法印出nickName
    public static void callNuckNameWithStatic() {
        System.out.println("Total persons is " + personCount);
    }
}
