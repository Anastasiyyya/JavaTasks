package clothes;


public class Human {
    private String name;
    private IJacket jacket;
    private IShoes shoes;
    private ITrousers trousers;

    public Human(String name, Jacket jacket, Shoes shoes, Trousers trousers){
        this.name =  name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers =  trousers;
    }

    public Human() {
    }

    public IJacket getJacket() {
        return jacket;
    }
    public void setJacket() {
        this.jacket = jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }
    public void setShoes() {
        this.shoes = shoes;
    }

    public ITrousers getTrousers() {
        return trousers;
    }
    public void setTrousers() {
        this.trousers = trousers;
    }


    public void getDressed() {
        System.out.println(name + " надевает: ");
        jacket.putOn();
        shoes.putOn();
        trousers.putOn();
    }

    public void unDressed() {
        System.out.println(name + " снимает: ");
        jacket.takeOff();
        shoes.takeOff();
        trousers.takeOff();
    }
}
