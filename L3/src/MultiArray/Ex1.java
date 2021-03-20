/*
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
Почитать сумму четных элементов стоящих на главной диагонали.
 */
package MultiArray;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of elements:");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 51);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
                if (arr[i][i] % 2 == 0) {
                    sum += arr[i][i];
                }
        }
        System.out.println(sum);
    }
}
