public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processor = "dfbd";
        computer.randomAccessMemory = "dfbd";
        computer.hardDrive = "dfbd";
        computer.fullCycle = 1;
        System.out.println(computer.getInformation());
        computer.turnOn();
    }
}



