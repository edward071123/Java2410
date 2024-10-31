package lesson1;
public class DemoUseClass {

    /* 如何呼叫使用類別 */
    public static void main(String[] args) throws Exception {

        // 想像情境: 登入報名(填寫報名的名字登入到系統建檔)
        // 實作(實體化)類別(Class) 變成物件(Object)
        Person person1 = new Person("Edward");
        Person person2 = new Person("David");

        // 想像情境: 公布報名的人名是否有錯
        // 取出物件的屬性
        System.out.println(person1.personName);
        System.out.println(person2.personName);

        // 想像情境: 公布報名的人名有錯需要修正
        // 設定物件的屬性
        person1.personName = "Edward1";
        person2.personName = "David1";

        // 想像情境: 最終公布報名的最終名單
        // 物件呼叫方法
        person1.showName();
        person2.showName();

        // 想像情境: 查看報名人數
        // 靜態屬性呼叫
        System.out.println(Person.personCount);

        // 想像情境: 公布報名人數
        // 靜態方法呼叫
        Person.callCountWithStatic();


        // =============================================================================

        // 想像情境: 開了間車行將買入的車子登入系統建檔(編號,顏色,是否營業車,年限)
        // 實作(實體化)類別(Class) 變成物件(Object)
        Car car1 = new Car("001","blue", false, 10);
        Car car2 = new Car("002","yellow", true, 20);
        Car car3 = new Car("003","red", false, 15);
        Car car4 = new Car("004", "black", false, 30);

        // 想像情境: 登入完畢後,分別開啟車子的資訊查看資訊是否正確
        // 物件呼叫方法
        car1.showCarInfo();
        car2.showCarInfo();
        car3.showCarInfo();
        car4.showCarInfo();

        // 想像情境: 印出公司(company)名稱,貼在車上
        // 靜態方法呼叫
        Car.showCompanyWithStatic();
    }
}
