package lesson4.furnitures;

public class Oven implements IPower, IHeat {

    public Oven() {
		System.out.println("我是烤箱, 以下是我的詳細介紹");
	}

    @Override
	public void usePower() {
		System.out.println("一定需要用電");
	}

    @Override
    public void heatFood() {
        System.out.println("加熱食物");
    }
}
