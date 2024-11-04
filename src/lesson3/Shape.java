package lesson3;

public class Shape {
	public static final int Circle = 1;
	public static final int Square = 2;
	protected String shapeColor = "white.";

	Shape() {
		System.out.println("I am a shape.");
	}

	// 有 (final 修飾字)表示無法被繼承(覆寫 Override)
	final public void getSize() {
		System.out.println("Shape size is XL");
	}

	public void showShapeColor() {
		System.out.println("Shape color is " + this.shapeColor);
	}

	public void drawShape() {
		System.out.println("Draw a shape.");
	}

	public void switchDrawShape(int shapeType, String shapeName) {
        switch (shapeType) {
            case Shape.Circle:
                System.out.println("Draw a circle and name is: " + shapeName);
                break;
            case Shape.Square:
                System.out.println("Draw a square and name is: " + shapeName);
                break;
            default:
                System.out.println("Draw nothing");
                break;
        }
    }
}
