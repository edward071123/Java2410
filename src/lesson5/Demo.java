package lesson5;

/*
 * Anonymous(匿名類別)
 * 正常的流程是：先寫一個子類別去繼承父類別，或是接上interface，覆寫裡面的方法之後，再到主方法當中用new建立物件，之後調用方法。
 * 但是如果這個interface只需要被使用到一次而已，透過這個流程會相當繁瑣跟多餘。
 * 此時就可以使用匿名內部類別的方式進行創立物件與方法使用，會比較方便。
 */
public class Demo {
    public static void main(String[] args) {
        // 需要被大量使用的寫法 =======================================
        Person person1 = new Person();
        person1.swimFreeStyle();

        Person person2 = new Person();
        person2.swimFreeStyle();


        // 寫法1 =================================================
        ISwim s = new ISwim() {
            public void swimFreeStyle() {
                System.out.println("I can free style swim. -- Anonymous1");
            }

            @Override
            public void swimBackStyle() {
                System.out.println("I can back style swim. -- Anonymous1");
            }
        };

        s.swimFreeStyle();
        s.swimBackStyle();
        // ============================================================

        // 寫法2 =================================================
        new ISwim() {
            @Override
            public void swimFreeStyle() {
                System.out.println("I can free style swim. -- Anonymous2");
            }

            @Override
            public void swimBackStyle() {
                
            }

        }.swimFreeStyle();
        // ============================================================

        // 寫法3 =======================================================
        method(new ISwim() {
            @Override

            public void swimFreeStyle() {
                System.out.println("I can free style swim -- Anonymous3");
            }

            @Override
            public void swimBackStyle() {
                System.out.println("I can back style swim. -- Anonymous3");
            }
        });
        // ===================================================================

        // 寫法4 =============================================================
        new Eat() {

            @Override
            public void eatingAlot() {
                System.out.println("I can eat alot -- Anonymous2");
            }
        }.eatingAlot();

        // ===================================================================

        // lambada演化 =============================================================
        // 原本呼叫式
        runMethod(new IRun() {
            @Override
            public void run(String name) {
                System.out.println(name + " can run fast. -- Anonymous3");
            }

        });

        // lambada一行搞定
        runMethod((String name) -> System.out.println(name + " can run fast. -- lambada"));


    }
    
    public static void method(ISwim s) {
        s.swimFreeStyle();
        s.swimBackStyle();
    }

    public static void runMethod(IRun s) {
        s.run("David");
    }

}
