import javax.swing.*;
/*
В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д.
 */
public class Ex7 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Write a number of programmers:");
        int a1 = Integer.parseInt(a);
        //int a1 = (int) (Math.random() * 1000);
        if (a1 % 100 >= 12 && a1 % 100 <= 14) {
            System.out.println(a1 + " программистоD");
        } else {
            switch (a1 % 10) {
                case 1:
                    if (a1 % 100 == 11) {
                        System.out.println(a1 + " программистов");
                    } else {
                        System.out.println(a1 + " программист");
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(a1 + " программистa");
                    break;
                default:
                    System.out.println(a1 + " программистов");
            }
        }
    }
}

