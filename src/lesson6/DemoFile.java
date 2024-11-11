package lesson6;

import java.io.FileWriter;

public class DemoFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\MyJava\\Java2410\\src\\lesson6\\log.txt");
            fw.write("This is first log!!");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            System.out.println("寫入log檔出現問題");
        }
    }
}
