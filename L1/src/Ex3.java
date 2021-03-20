/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.
 */

import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        try {
            String s = JOptionPane.showInputDialog(null, "Write a number:");
            int n = Integer.parseInt(s);
            if (n > 0) {
                n += 1;
            } else if (n < 0) {
                n -= 2;
            } else if (n == 0) {
                n = 10;
            }
            JOptionPane.showMessageDialog(null,"The result: " + n);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Incorrect input!");
        }
    }
}