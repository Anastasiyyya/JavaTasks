public class AirTransport extends Transport{

    int wingspan; //размах крыльев
    int minLengthForTakeOff; //минимальная длина взлётно-почсадочной полосы

    public AirTransport(int power, int maxSpeed, int weight, String brand,
                        int wingspan, int minLengthForTakeOff) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthForTakeOff = minLengthForTakeOff;
    }


}
