package space;

public class Main {
    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch(shuttle);
        cosmodrome.launch(spaceX);
    }
}
