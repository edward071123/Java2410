import javax.swing.*;
public class HolloWorldSwing {
    public static void main(String[] args) {
        // 顯示畫面
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // 實體化視窗
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 在畫面中增加label: Hello World
        JLabel label = new JLabel("Hello World");
        label.setBounds(10,20,80,25);
        frame.getContentPane().add(label);

        // 顯示視窗
        frame.pack();
        frame.setSize(350, 200);
        frame.setVisible(true);
    }
}