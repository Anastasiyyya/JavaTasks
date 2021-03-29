package space;

public class SpaceX implements IStart{

    public SpaceX(){
    }

    @Override
    public boolean prelaunchCheck() {
        int random = (int) (Math.random() * 10 + 1);
        if (random > 0 && random < 5){
            System.out.println(random);
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void launch() {
        System.out.println("Двигатели SpaceX запущены!");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX!");
    }


}
