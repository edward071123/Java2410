package lesson3;


public class Demo {
    public static void main(String[] args) {
        // ================================== 繼承範例開始 ================================
        System.out.println("============================================================");

        Shape shape = new Shape();
        shape.drawShape();
        shape.showShpeColor();
        shape.getSize();

        System.out.println("============================================================");

        Circle circle = new Circle("c01");
        circle.drawShape();
        circle.showShpeColor();
        circle.showCircleColor();
        circle.getSize("XS");
        // 顯示自有方法
        circle.showPoint();

        System.out.println("============================================================");

        Square square = new Square("sq01");
        square.drawShape();
        square.showShpeColor();
        square.showSquareColor();
        // 顯示自有方法
        square.showPerimeter();

        System.out.println("============================================================");
        // ================================== 繼承範例結束 ================================
        

        // ================================== 多型範例開始 ================================
        // ================================== 寫法1 ================================
        Shape swShape = new Shape();
        swShape.switchDrawShape(Shape.Circle, "c11");
        swShape.switchDrawShape(Shape.Square, "sq11");
        swShape.switchDrawShape(Shape.Circle, "c12");
        System.out.println("============================================================");

        // ================================== 寫法2 ================================
        Shape polymorphismSh = new Shape();
        polymorphismSh.drawShape();

        System.out.println("============================================================");

        Shape polymorphismCi1 = new Circle("c21");
        polymorphismCi1.drawShape();

        System.out.println("============================================================");

        Shape polymorphismSq = new Square("sq21");
        polymorphismSq.drawShape();

        System.out.println("============================================================");

        Shape polymorphismCi2 = new Circle("c22");
        polymorphismCi2.drawShape();

        System.out.println("============================================================");

        // ================================== 寫法3 ================================
        Shape[] shapes = new Shape[] {
            new Circle("c31"),
            new Square("sq31"),
            new Circle("c32"),
        };

        System.out.println("============================================================");
        for (Shape loopShape : shapes) {
            loopShape.drawShape();
            System.out.println("============================================================");
        }

        // ================================== 錯誤寫法 ================================

        // 父類型無法確認子類型的方法是否存在 所以這樣就會出錯(但是編譯會pass)
        // Shape polymorphismCi1 = (Circle) new Shape();
        // active(polymorphismCi1);

        // 父類型無法確認子類型的方法是否存在 所以這樣就會出錯(但是編譯會pass)
        // Shape polymorphismSq1 = (Square) new Shape();
        // active(polymorphismSq1);
        // ================================== 多型範例結束 ================================


        // ================================== 多載範例開始 ================================
        Circle c4 = new Circle("c41");
        c4.calculateArea();
        c4.calculateArea(6);
        c4.calculateArea(3, 7);
        c4.calculateArea(4, 8, "Edward");

        System.out.println("============================================================");
        // ================================== 多載範例結束 ================================
    }
    
}
