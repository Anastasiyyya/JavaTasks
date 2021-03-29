package clothes;

public class Shoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("-обувь.");
    }

    @Override
    public void takeOff() {
        System.out.println("-обувь.");
    }
}
