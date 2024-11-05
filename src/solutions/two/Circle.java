package solutions.two;

public class Circle extends Shape implements IArea, IPerimeter {

    @Override
    public void showPerimeter() {
        double PI = 3.14;
        int radius = 8;
        double perimeter = radius * 2 * PI;
        System.out.println("圓周長：" + perimeter);
    }

    @Override
    public void showArea() {
        double PI = 3.14;
        int radius = 8;
        double area = radius * radius * PI;
        System.out.println("圓面積：" + area);
    }

    @Override
    public void showShapeInfo() {
        System.out.println("I am a circle.");
    }

}
