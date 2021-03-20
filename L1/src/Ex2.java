/*
Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
существует.
 */

import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Write a parameter:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Write b parameter:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Write c parameter:"));
        if ((a +b > c) || (a + c > b) || (b + c > a)){
            JOptionPane.showMessageDialog(null,"The triangle exists!");
        } else {
            JOptionPane.showMessageDialog(null,"Error, try again=)");
        }
    }
}
