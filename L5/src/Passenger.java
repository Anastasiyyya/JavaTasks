import java.util.Scanner;

public class Passenger extends Terrestrial{

    String type; //тип кузова
    int numberOfPassengers;


    public Passenger(int power, int maxSpeed, int weight,
                     String brand, int numberOfWheels, int fuelConsumption, String type, int numberOfPassengers){
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public double Power(double power1){
        return this.power * 0.74;
    }

    public void info(){
        System.out.println("///Легковой транспорт///" +
                "\nМощность(л.с.): " + power + "; Максимальная скорость(км/ч): " + maxSpeed +
                        "; Масса(кг): " + weight + "; Марка: " + brand + "; Количество колес: " +
                        numberOfWheels + "; Расход топлива(л/100км): " + fuelConsumption + "; Тип кузова: "  +
                        type + "; Количество пасажиров: " + numberOfWheels + "; Мощность(кВ): " + Power(power));
        System.out.println("-----------------------------");
    }

    public void distanceAndConsumption(Scanner scanner){
        System.out.println("Enter a time (hours): ");
        double time = scanner.nextDouble();
        double distance = maxSpeed * time;
        double consumption = distance * fuelConsumption;
        System.out.println("За время " +  time + " ч, автомобиль " + brand +
                " ,двигаясь с максимальной скоростью " + maxSpeed + "км/ч," +
                " проедет " +  distance + " км и израсходует " + consumption + " литров топлива.");
    }
}
