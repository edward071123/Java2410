package lesson4.furnitures;

// 冰箱: 天生就是儲存食物的櫃子, 加上電力, 加上冷媒
public class Fridge extends FoodCabinet implements IPower, IRefrigeration {

	public Fridge(String size) {
		super(size);
		System.out.println("我是冰箱, 以下是我的詳細介紹");
	}
	
	@Override
	public void refrigerate() {
		System.out.println("用冷媒來實現冷藏＆冷凍來保持食物新鮮, 久放不壞");
	}

	@Override
	public void usePower() {
		System.out.println("一定需要用電");
	}

	@Override
	public void preserveFoods() {
		System.out.println("是專門保存食物的櫃子");
	}

}
