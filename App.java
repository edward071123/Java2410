public class App {

    /* 測試 */
    // public static void main(String[] args) {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String testString = dev(1, 2);

        // String testString1 = test1();

        
         System.out.println(testString);
    }


    public static String dev(int num1, int num2) {
        String rTest = "test";
        return rTest;
    }

    public static String test1() {
        String rTest = "test";
        return rTest;
    }

    private static String test12() {
        String rTest = "test";
        return rTest;
    }

    static String test13() {
        return "test13";
    }

    String test14() {
        return "test14";
    }

    protected String test15() {
        return "test15";
    }

    public void test2() {
        String rTest = "test";
    }

    public boolean test() {
        return false;
    }
}