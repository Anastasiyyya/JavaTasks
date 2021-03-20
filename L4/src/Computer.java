import java.util.Scanner;

public class Computer {
    String processor;
    String randomAccessMemory;
    String hardDrive;
    int fullCycle;

    public String getInformation() {
        return "Процессор: " + processor + ";\nОперативная память: " + randomAccessMemory + ";\nЖесткий диск: " + hardDrive + ";\nРесурс работы: " + fullCycle;
    }

    public void turnOn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write full cycle:");
        fullCycle = scanner.nextInt();
        boolean bool = true;
        int count = 0;
        for (int i = 0; i < fullCycle; i++) {
            int oneTwo = (int) (Math.random() * 2);
            System.out.println("Random:" + oneTwo);
            System.out.println("Let's start. Please, enter 0 or 1:");
            int inputOn = scanner.nextInt();
            if (oneTwo == inputOn) {
                System.out.println("Great, your computer turned on!!");
                break;
            } else {
                bool = false;
                System.out.println("Sorry, your computer burned out=)");
                count++;
                break;
            }
        }
        if (bool) {
            System.out.println("Ok, good job!");
        } else if (count <= fullCycle){
            System.out.println("Ooops, your computer broke down");
        }
    }
}
