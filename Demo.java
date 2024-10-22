public class Demo {
    public static void main(String[] args) throws Exception {
        // 實作(實體化)類別(Class) 變成物件(Object)
        Person person1 = new Person("Edward");
        Person person2 = new Person("David");

        // 取出物件的屬性
        System.out.println(person1.personName);
        System.out.println(person2.personName);

        // 設定物件的屬性
        person1.personName = "Edward1";
        person2.personName = "David1";

        // 物件呼叫方法
        person1.showName();
        person2.showName();

        // 靜態屬性呼叫
        System.out.println(Person.personCount);

        // 靜態方法呼叫
        Person.callNuckNameWithStatic();
    }
}
