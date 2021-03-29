package space;

public class Shuttle implements IStart{

    public Shuttle(){

    }

    @Override
    public boolean prelaunchCheck() {
        int random = (int) (Math.random() * 10 + 1);
        if (random > 3){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void launch() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
