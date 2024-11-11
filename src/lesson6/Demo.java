package lesson6;

import java.io.FileWriter;
import java.nio.charset.Charset;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * 介紹 try catch 用法
 */
public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        String[] testString = {"a", "b", "c", "d"}; 
        // int[] testInt = {1, 2, 3};
        
        try {
            System.out.println(testString[4]);
            int result = a / b;
            System.out.println("result:" + result );
        } catch (ArrayIndexOutOfBoundsException ex) {
            // ex.getMessage()通常寫入系統錯誤的log檔讓開發工程師查看
            writeLog(ex.getMessage());
            System.out.println("Array出錯了");
        } catch (ArithmeticException ex) {
            // ex.getMessage()通常寫入系統錯誤的log檔讓開發工程師查看
            writeLog(ex.getMessage());
            System.out.println("除的時候出錯了");
        } catch (Exception ex) {
            // ex.getMessage() 通常寫入系統錯誤的log檔讓開發工程師查看
            // ex.fillInStackTrace() 通常寫入系統錯誤的log檔讓開發工程師查看
            writeLog(ex.getMessage());
            System.out.println("出錯了");
        } finally {
            // 最終都會跑進來這
            System.out.println("done.");
        }
    }

    public static void writeLog(String error) {
        try {
            // 取得當下時間
            LocalDateTime localDate = LocalDateTime.now();
            // 時間格式化
            DateTimeFormatter format = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
            // 寫入的檔案路徑
            String filePath = "D:\\MyJava\\Java2410\\src\\lesson6\\log.txt";
            // 開啟檔案串流準備寫入檔案, 設定utf-8寫入中文不會亂碼
            FileWriter fw = new FileWriter(filePath, Charset.forName("utf-8"), true);
            // 寫入內容
            fw.write("錯誤發生: " + error + "     " + format.format(localDate) + "\r\n");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("寫入log檔出現問題");
        }
    }
}
