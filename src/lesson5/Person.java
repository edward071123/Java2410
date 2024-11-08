package lesson5;

public class Person implements ISwim{

    @Override
    public void swimFreeStyle() {
       System.out.println("I can free style swim.");
    }
    
    @Override
    public void swimBackStyle() {
       System.out.println("I can back style swim.");
    }
}
