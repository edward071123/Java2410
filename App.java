public class App {

    /* 測試 */
    // public static void main(String[] args) {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String testString = dev(1, 2);

        // String testString1 = test1();

        
         System.out.println(testString);
    }

    // 有傳入參數
    public static String dev(int num1, int num2) {
        String rTest = "test";
        return rTest;
    }

    // 無傳入參數
    public static String test1() {
        String rTest = "test";
        return rTest;
    }

    // 不公開
    private static String test12() {
        String rTest = "test";
        return rTest;
    }

    // 無前贅字 
    static String test13() {
        return "test13";
    }

    // 無前贅字 無靜態關鍵字
    String test14() {
        return "test14";
    }

    // 保護且無靜態關鍵字
    protected String test15() {
        return "test15";
    }

    // 無須回傳值
    public void test2() {
        String rTest = "test";
    }

    public boolean test() {
        return false;
    }
}
