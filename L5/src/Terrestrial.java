//наземный
public class Terrestrial extends Transport{

    int numberOfWheels;
    int fuelConsumption; // л/100км

    public Terrestrial(int power, int maxSpeed, int weight,
                       String brand, int numberOfWheels, int fuelConsumption){
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }


}
