package lesson6;

/*
 * 介紹 try catch 用法
 */
public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        String[] testString = {"a", "b", "c", "d"}; 
        int[] testInt = {1, 2, 3};
        
        try {
            System.out.println(testString[4]);
            int result = a / b;
            System.out.println("result:" + result );
        } catch (ArrayIndexOutOfBoundsException ex) {
            // ex.getMessage()通常寫入系統錯誤的log檔讓開發工程師查看
            System.out.println(ex.getMessage());
            System.out.println("Array出錯了");
        } catch (ArithmeticException ex) {
            // ex.getMessage()通常寫入系統錯誤的log檔讓開發工程師查看
            System.out.println(ex.getMessage());
            System.out.println("除的時候出錯了");
        } catch (Exception ex) {
            // ex.getMessage() 通常寫入系統錯誤的log檔讓開發工程師查看
            // ex.fillInStackTrace() 通常寫入系統錯誤的log檔讓開發工程師查看
            System.out.println(ex.getMessage());
            System.out.println(ex.fillInStackTrace());
            System.out.println("出錯了");
        } finally {
            // 最終都會跑進來這
            System.out.println("done.");
        }
    }
}
