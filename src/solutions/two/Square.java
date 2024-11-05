package solutions.two;

public class Square extends Shape implements IArea, IPerimeter{

    @Override
    public void showPerimeter() {
        int length = 9;
        int perimeter = length * 4;
        System.out.println("正方形周長: "+ perimeter);
    }

    @Override
    public void showArea() {
        int length = 9;
        int area = length * length;
        System.out.println("正方形面積: "+ area);
    }

    @Override
    public void showShapeInfo() {
        System.out.println("I am a square.");
    }

    @Override
    public String toString() {
        return "重新定義正方形";
    }
    
}
