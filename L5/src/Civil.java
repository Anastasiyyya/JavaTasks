public class Civil extends AirTransport{

    int civilNumberOfPassengers;
    boolean businessClass;

    public Civil(int power, int maxSpeed, int weight, String brand,
                 int wingspan, int minLengthForTakeOff,
                 int civilNumberOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthForTakeOff);
        this.civilNumberOfPassengers = civilNumberOfPassengers;
        this.businessClass = businessClass;
    }

    public void info(){
        System.out.println("///Воздушный гражданский транспорт///" +
                "\nМощность(л.с.): " + power + "; Максимальная скорость(км/ч): " + maxSpeed +
                "; Масса(кг): " + weight + "; Марка: " + brand + "; Размах крыльев(м): " +
                wingspan + "; Длина полосы: " + minLengthForTakeOff + "; Количество пассажиров : "  + civilNumberOfPassengers + "; Наличие бизнес класса: " + businessClass + "; Мощность(кВ): " + Power(power));
        System.out.println("-----------------------------");
    }

    public void numberOfPassengers(int number){
        System.out.println("\n/Проверяем ваш грузовик/");
        if (number < civilNumberOfPassengers){
            System.out.println("Можем лететь =)");
        }else {
            System.out.println("Вам нужен самолёт побольше =(");
        }
    }
}

