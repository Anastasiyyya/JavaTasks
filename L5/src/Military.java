public class Military extends AirTransport {

    boolean bailoutSystem; // наличие системы катапультировнаия
    int numberOfMissiles; //количество ракет на борту

    public Military(int power, int maxSpeed, int weight, String brand,
                    int wingspan, int minLengthForTakeOff,
                    boolean bailoutSystem, int numberOfMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthForTakeOff);
        this.bailoutSystem = bailoutSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void info(){
        System.out.println("///Воздушный военный транспорт///" +
                "\nМощность(л.с.): " + power + "; Максимальная скорость(км/ч): " + maxSpeed +
                "; Масса(кг): " + weight + "; Марка: " + brand + "; Размах крыльев(м): " +
                wingspan + "; Длина полосы: " + minLengthForTakeOff + "; Система катапультирования : "  + bailoutSystem + "; Количество ракет: " + numberOfMissiles + "; Мощность(кВ): " + Power(power));
        System.out.println("-----------------------------");
    }

    public void shot(){
        System.out.println("\n/Проверяем ракеты/");
        if (numberOfMissiles == 0){
            System.out.println("Боеприпасы отсутствуют");
        }else {
            System.out.println("Ракета пошла...");
        }
    }

    public void bailoutSystem(){
        System.out.println("\n/Проверяем Катапультирование/");
        if (bailoutSystem){
            System.out.println("Катапультирование прошло успешно.");
        }else {
            System.out.println("У вас нет такой системы.");
        }
    }
}
