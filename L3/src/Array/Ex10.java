package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int j = 0;
        if (n > 3) {
            int[] a1 = new int[n];
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (int) (Math.random() * (n+1));
                if (a1[i] % 2 == 0) {
                    j++;
                }
            }
            System.out.print(Arrays.toString(a1));
            if (j != 0) {
                int[] a2 = new int[j];
                for (int i = 0; i < a2.length; i++) {
                    if (a1[i] % 2 == 0) {
                        a2[i] = a1[i];
                        j++;
                    }
                }
                System.out.print(Arrays.toString(a2));
            }
        }else {
            System.out.println("Error, please enter a number > 3!!!");
        }
    }
}

