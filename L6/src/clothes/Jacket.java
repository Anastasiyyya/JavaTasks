package clothes;

public class Jacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("-куртку.");
    }

    @Override
    public void takeOff() {
        System.out.println("-куртку.");
    }
}
