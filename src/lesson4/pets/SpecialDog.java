package lesson4.pets;

public class SpecialDog extends Dog implements ITraningSkill {

	@Override
	public void catchTheBall() {
		System.out.println("我領養的狗經過訓練後已經學會接球");
	}

	@Override
	public void eat() {
		System.out.println("我領養的狗天生就會覓食");
	}

	@Override
	public void sleep() {
		System.out.println("我領養的狗天生就會休息");
	}

}
