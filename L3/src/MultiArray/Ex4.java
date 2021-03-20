/*
4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
 */
package MultiArray;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of elements:");
        int sum = 0;
        int in = scanner.nextInt();
        int[][] arr = new int[in][in];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов над побочной диагональю: " + sum);
    }
}