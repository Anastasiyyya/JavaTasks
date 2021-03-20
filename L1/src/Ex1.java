/*
В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
 */


import javax.swing.*;

public class Ex1 {

    public static void main(String[] args) {
        String userNumber = JOptionPane.showInputDialog(null, "Please, write a number:", JOptionPane.QUESTION_MESSAGE);
        int n = Integer.parseInt(userNumber);
        if (n > 0) {
            JOptionPane.showMessageDialog(null, "The input number is positive");
            if (n < 9) {
                JOptionPane.showMessageDialog(null, "One digit number");
            } else if (n > 9 && n < 100) {
                JOptionPane.showMessageDialog(null, "Two digit number");
            } else if (n > 99) {
                JOptionPane.showMessageDialog(null, "Your number is more than 2 digits");
            }
        } else if (n < 0) {
            JOptionPane.showMessageDialog(null, "The input number is negative");
            if (n >= -9) {
                JOptionPane.showMessageDialog(null, "One digit number");
            } else if (n < -9 && n > -100) {
                JOptionPane.showMessageDialog(null, "Two digit number");
            } else if (n < -99) {
                JOptionPane.showMessageDialog(null, "Your number is more than 2 digits");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You entered 0");
        }
    }
}