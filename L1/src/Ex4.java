/*
Даны 3 целых числа.
Найти количество положительных чисел в исходном наборе.
 */

import javax.swing.*;


public class Ex4 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog(null, "Write the first number:");
        String n2 = JOptionPane.showInputDialog(null, "Write the second number:");
        String n3 = JOptionPane.showInputDialog(null, "Write the third number:");
        int count = 0;
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(n1);
        arr[1] = Integer.parseInt(n2);
        arr[2] = Integer.parseInt(n3);
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        } JOptionPane.showMessageDialog(null, "The amount of positive numbers: " + count);
    }
}