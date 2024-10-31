package lesson1;
public class MethodInfo {

    /* 展示Method的不同樣式 */
    public static void main(String[] args) throws Exception {

        int testResult1 = test1(1, 2, 3);
        System.out.println(testResult1);

        String testResult2 = test2();
        System.out.println(testResult2);

        String testResult3 = test3();
        System.out.println(testResult3);

        String testResult4 = test4();
        System.out.println(testResult4);

        String testResult5 = new MethodInfo().test5();
        System.out.println(testResult5);

        int testResult6 = new MethodInfo().test6();
        System.out.println(testResult6);

        // 無回傳值就不用再宣告變數接回來
        new MethodInfo().test7();

        // 回傳布林值(true/false)
        boolean testResult8 = new MethodInfo().test8();
        System.out.println(testResult8);
    }

    // 公開,靜態, 有傳入參數(int, int), 回傳String
    public static int test1(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

    // 公開, 靜態, 無傳入參數, 回傳String
    public static String test2() {
        String result = "test2";
        return result;
    }

    // 私有, 靜態, 無傳入參數, 回傳String
    private static String test3() {
        String result = "test3";
        return result;
    }

    // 無前贅字, 靜態, 無傳入參數, 回傳String
    static String test4() {
        String result = "test4";
        return result;
    }

    // 無前贅字, 非靜態, 無傳入參數, 回傳String
    String test5() {
        String result = "test5";
        return result;
    }

    // 保護, 非靜態, 無傳入參數, 回傳int
    protected int test6() {
        int result = 66;
        return result;
    }

    // 公開, 非靜態, 無傳入參數, 無回傳
    public void test7() {
        System.out.println("test7");
        return; // 可省略
    }

    // 公開, 非靜態, 無傳入參數, 回傳布林
    public boolean test8() {
        boolean result = false;
        return result;
    }
}
