public class Transport {

    int power;    //лошадиных сил
    int maxSpeed; //км/ч
    int weight;   //кг
    String brand;

    public Transport(int power, int maxSpeed, int weight, String brand){
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double Power(double power1){
        return this.power * 0.74;
    }
}
