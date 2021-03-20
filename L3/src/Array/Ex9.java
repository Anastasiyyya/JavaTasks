package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int in = scanner.nextInt();
        int left = 0;
        int right = 0;
        int[] a = new int[in];
        if (in % 2 == 0) {
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * 16);
            }
            for (int i = 0; i < a.length / 2; i++) {
                left += Math.abs(a[i]);
            }
            for (int i = a.length/2; i < a.length; i++) {
                right += Math.abs(a[i]);
            }
            if (left > right){
                System.out.println("Сумма модулей левой половины массива больше: " + left + " > " + right);
            } else if (left < right){
                System.out.println("Сумма модулей левой половины массива меньше: " + left + " < " + right);
            } else {
                System.out.println("Суммы модулей равны!");
            }
        }
        System.out.println(Arrays.toString(a));
    }
}