package solutions.two;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================");

        Circle c1 = new Circle();
        c1.showShapeInfo();
        c1.showArea();
        c1.showPerimeter();

        System.out.println("=============================");

        Square sq1 = new Square();
        sq1.showShapeInfo();
        sq1.showArea();
        sq1.showPerimeter();
        System.out.println(sq1.toString());
        System.out.println("=============================");

        
    }
}
