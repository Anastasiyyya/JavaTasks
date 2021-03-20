/*
Даны 3 целых числа.
Найти количество положительных и отрицательных
чисел в исходном наборе.
 */

import javax.swing.*;


public class Ex5 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog(null, "Write the first number:");
        String n2 = JOptionPane.showInputDialog(null, "Write the second number:");
        String n3 = JOptionPane.showInputDialog(null, "Write the third number:");
        int countPositive = 0;
        int countNegative = 0;
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(n1);
        arr[1] = Integer.parseInt(n2);
        arr[2] = Integer.parseInt(n3);
        for (int i : arr) {
            if (i > 0) {
                countPositive++;
            } else if (i < 0){
                countNegative++;
            }
        } JOptionPane.showMessageDialog(null, "Positive numbers: " + countPositive + " , " + "Negative numbers: " + countNegative);
    }
}
