package lesson3;

public class Square extends Shape {
	private String shapeColor = "blue.";
	private String shapeName;

	Square(String shapeName) {
		// super(); // 可忽略、但是實際上系統還是會存在
		this.shapeName = shapeName;
		System.out.println("I am a square from shape.");
	}

	// Square自有的方法
	public void showPerimeter() {
		System.out.println("Square perimeter is 40.");
	}

	public void showSquareColor() {
		// 呼叫父類別的屬性可用super
		System.out.println("Square get Shape color is " + super.shapeColor);
		// 呼叫本身類別的屬性可用this
		System.out.println("Square color is " + this.shapeColor);
	}

	// 覆寫 Override: 子類別可以覆寫父類別的方法內容，使該方法擁有不同於父類別的行為。
	// 需滿足以下條件:
	// 1. 父類別方法不能用 final 修飾。
	// 2. 子類別覆寫的方法名稱、回傳型態、參數個數順序需相同。
	// 3. 子類別覆寫的方法，其開放權限不可以小於要覆寫的父類別方法。
	// *** 父類別方法是public, 子類別的覆寫的方法不能是private or protected or no modifier(無修飾字)
	@Override
	public void drawShape() {
		System.out.println("Draw a square and name is: " + this.shapeName);
	}

	
}
