public class App {

    /* 展示Method的不同樣式 */
    // public static void main(String[] args) {
    public static void main(String[] args) throws Exception {

        String testString = dev(1, 2);

        String testString1 = test1();

        System.out.println(testString);
    }

    // 公開,靜態, 有傳入參數(int, int), 回傳String
    public static String test1(int num1, int num2) {
        String rTest = "test";
        return rTest;
    }

    // 公開, 靜態, 無傳入參數, 回傳String
    public static String test2() {
        String rTest = "test";
        return rTest;
    }

    // 私有, 靜態, 無傳入參數, 回傳String
    private static String test3() {
        String rTest = "test";
        return rTest;
    }

    // 無前贅字, 靜態, 無傳入參數, 回傳String
    static String test4() {
        return "test13";
    }

    // 無前贅字, 非靜態, 無傳入參數, 回傳String
    String test5() {
        return "test14";
    }

    // 保護, 非靜態, 無傳入參數, 回傳int
    protected String test6() {
        int result = 77;
        return result;
    }

    // 公開, 非靜態, 無傳入參數, 無回傳
    public void test7() {
        String rTest = "test";
    }

    // 公開, 非靜態, 無傳入參數, 回傳布林
    public boolean test8() {
        return false;
    }
}
