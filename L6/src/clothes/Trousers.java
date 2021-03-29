package clothes;

public class Trousers implements ITrousers{
    @Override
    public void putOn() {
        System.out.println("-брюки.");
    }

    @Override
    public void takeOff() {
        System.out.println("-брюки.");
    }
}