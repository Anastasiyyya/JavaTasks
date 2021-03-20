import javax.swing.*;

/*
Даны 2 числа. Вывести большее из них.
 */
public class Ex6 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "The first number:");
        String b = JOptionPane.showInputDialog(null, "The second number:");
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
        System.out.println(Math.max(n1,n2));
    }
}
