package lesson5;

/*
 * 匿名類別 (Anonymous)
 */
public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.swimFreeStyle();

        Person person2 = new Person();
        person2.swimFreeStyle();

        System.out.println("============================================================");
        ISwim s = new ISwim() {
            @Override
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

        System.out.println("============================================================");

        new ISwim() {
            @Override
            public void swimFreeStyle() {
               System.out.println("I can free style swim. -- Anonymous2");
            }

            @Override
            public void swimBackStyle() {
                
            }
        }.swimFreeStyle();

        System.out.println("============================================================");

        method1(new ISwim() {
            @Override
            public void swimFreeStyle() {
               System.out.println("I can free style swim. -- Anonymous3");
            }

            @Override
            public void swimBackStyle() {
                System.out.println("I can back style swim. -- Anonymous3");
            }
        });

        System.out.println("============================================================");

        new IRun() {
            @Override
            public void run(String name) {
                System.out.println(name + " can run fast. -- Anonymous2");
            }
        }.run("David");

        System.out.println("============================================================");

        runMethod1(new IRun() {
            @Override
            public void run(String name) {
                System.out.println(name + " can run fast. -- Anonymous3");
            }

        });

        runMethod1((String name) -> System.out.println(name + " can run fast. -- lambada"));
    

        System.out.println("============================================================");
    }

    public static void method1(ISwim s) {
        s.swimFreeStyle();
        s.swimBackStyle();
    }

    public static void runMethod1(IRun s) {
        s.run("David1");
    }


}
