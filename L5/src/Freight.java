import java.util.Scanner;

public class Freight extends Terrestrial{

    int carryingCapacity; //грузоподъёмность (т)

    public Freight(int power, int maxSpeed, int weight,
                   String brand, int numberOfWheels, int fuelConsumption,
                   int carryingCapacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public double Power(double power1){
        return this.power * 0.74;
    }

    public void info(){
        System.out.println("///Грузовой транспорт///" +
                "\nМощность(л.с.): " + power + "; Максимальная скорость(км/ч): " + maxSpeed +
                        "; Масса(кг): " + weight + "; Марка: " + brand + "; Количество колес: " +
                        numberOfWheels + "; Расход топлива(л/100км): " + fuelConsumption + "; Грузоподъемность : "  + carryingCapacity +  "; Мощность(кВ): " + Power(power));
        System.out.println("-----------------------------");
    }

    public void carryingCapacity(int capacity){
        System.out.println("\n/Проверяем ваш грузовик/");
        if (capacity < carryingCapacity){
            System.out.println("Грузовик загружен =)");
        }else {
            System.out.println("Вам нужен грузовик побольше =(");
        }
    }

}
