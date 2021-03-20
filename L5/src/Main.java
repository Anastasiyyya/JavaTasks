import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Passenger passenger =  new Passenger(123, 60, 123, "Ford",4, 123, "a", 4);
        passenger.info();

        Freight freight =  new Freight(123, 60, 123, "Ford",4, 123, 5);
        freight.info();

        Civil civil =  new Civil(123, 60, 123, "Ford",4, 123, 55, true);
        civil.info();

        Military military =  new Military(123, 60, 123, "Ford",4, 123, false, 0);
        military.info();

        Scanner scanner = new Scanner(System.in);
        passenger.distanceAndConsumption(scanner);

        freight.carryingCapacity(2);
        civil.numberOfPassengers(56);
        military.shot();
        military.bailoutSystem();
    }
}
