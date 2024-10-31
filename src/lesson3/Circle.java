package lesson3;

public class Circle extends Shape {
	private String shapeColor = "red.";
	private String shapeName;

	Circle(String shapeName) {
		super();
		this.shapeName = shapeName;
		System.out.println("I am a circle from shape.");
	}

	// Circle自有的方法
	public void showPoint() {
		System.out.println("Circle point is (10, 10).");
	}

	// 覆寫 Override: 子類別可以覆寫父類別的方法內容，使該方法擁有不同於父類別的行為。
	// 需滿足以下條件:
	// 1. 父類別方法不能用(final 修飾字)。
	// 2. 子類別覆寫的方法名稱、回傳型態、參數個數順序需相同。
	// 3. 子類別覆寫的方法，其開放權限不可以小於要覆寫的父類別方法。
	// *** 父類別方法是public, 子類別的覆寫的方法不能是private or protected or no modifier(無修飾字)
	@Override
	public void drawShape() {
		System.out.println("Draw a circle and name is: " + this.shapeName);
	}

	// 因父類別有有(final 修飾字), 無法(覆寫 Override), 但可以(多載 Overload)
	public void getSize(String size) {
		System.out.println("Circle size is " + size);
		
	}

	public void showCircleColor() {
		// 呼叫父類別的屬性可用super
		System.out.println("Circle get Shape color is " + super.shapeColor);
		// 呼叫本身類別的屬性可用this
		System.out.println("Circle color is " + this.shapeColor);
	}

	// 多載 Overload: 指在一個類別(class)中，定義多個名稱相同，但參數(Parameter)不同的方法(Method)
	// 需滿足以下條件:
	// 1. 命名相同。
	// 2. 回傳型態需相同。
	public void calculateArea() {
		double area = 3.14 * 5 * 5;
		System.out.println("The area1 is: " + area);
	}

	public void calculateArea(int radius) {
		double area = 3.14 * radius * radius;
		System.out.println("The area2 is: " + area);
	}

	public void calculateArea(int pi, int radius) {
		double area = pi * radius * radius;
		System.out.println("The area3 is: " + area);
	}

	// 回傳型態不同, 且與上面相同的傳入型態&參數數量
	// public double calculateArea(int pi, int radius) {
	// 	double area = pi * radius * radius;
	// 	return area;
	// }

	public void calculateArea(int pi, int radius, String byWhoDid) {
		double area = pi * radius * radius;
		System.out.println(byWhoDid + "calculates area4 is " + area);
	}
}
