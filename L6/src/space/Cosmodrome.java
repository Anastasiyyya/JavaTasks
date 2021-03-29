package space;

public class Cosmodrome {
    private IStart shuttle;

        public Cosmodrome(){
        }

        public IStart getSpaceship() {
            return shuttle;
        }

        public void setSpaceship(IStart shuttle) {
            this.shuttle = shuttle;
        }

    public void launch(IStart shuttle) {
        System.out.println("Запуск двигателя...");
        if (!shuttle.prelaunchCheck()) {
            System.out.println("Предстартовая проверка провалена.");
        } else {
            int i = 11;
            while (i > 1){
                i--;
                System.out.println(i);
            }
            shuttle.start();
        }

    }
}


