package lesson5;

/*
 * Anonymous(匿名類別)
 * 正常的流程是：先寫一個子類別去繼承父類別，或是接上interface，覆寫裡面的方法之後，再到主方法當中用new建立物件，之後調用方法。
 * 但是如果這個interface只需要被使用到一次而已，透過這個流程會相當繁瑣跟多餘。
 * 此時就可以使用匿名內部類別的方式進行創立物件與方法使用，會比較方便。
 */
public class Demo {
    public static void main(String[] args) {
        // 介面寫法1 =======================================
        ISwim s = new ISwim() {

            @Override
            public void swim() {
                System.out.println("I can swim -- 1!!");
            }
        };

        s.swim();
        // =============================================

        // 介面寫法2 =======================================
        new ISwim() {

            @Override
            public void swim() {
                System.out.println("I can swim -- 2!!");
            }
        }.swim();
        // =============================================

        // 介面寫法3 =======================================
        method(new ISwim() {

            @Override
            public void swim() {
                System.out.println("I can swim -- 3!!");
            }
        });
        // =============================================

        // 介面lambda寫法 =======================================
        method(() -> System.out.println("I can drive -- lambda!!"));

        // =============================================

        // 抽象類別寫法 =======================================
        new Eat() {

            @Override
            public void eatingAlot() {
                System.out.println("I can eat alot -- abstract!!");
            }
        }.eatingAlot();

        // =============================================


    }
    
    public static void method(ISwim s) {
        s.swim();
    }
}
