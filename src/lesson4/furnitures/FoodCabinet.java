package lesson4.furnitures;

public abstract class FoodCabinet {
	private String size;

	FoodCabinet(String size) {
		this.size = size;
	}

	public abstract void preserveFoods();
	
	public void showSize() {
		System.out.println("尺寸為: " + this.size);
	}

}
