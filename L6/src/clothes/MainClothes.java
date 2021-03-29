package clothes;

public class MainClothes {
    public static void main(String[] args) {

        Jacket jacket =  new Jacket();
        Shoes shoes = new Shoes();
        Trousers trousers =  new Trousers();

        Human human1 =  new Human("Ivan", jacket, shoes, trousers);
        Human human2 =  new Human("Michael", jacket, shoes, trousers);

        human1.getDressed();
        human1.unDressed();

        human2.getDressed();
        human2.unDressed();

    }
}
