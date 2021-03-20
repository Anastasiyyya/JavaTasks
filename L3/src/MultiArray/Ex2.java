/*
Вывести нечетные элементы находящиеся под главной
диагональю(включительно).
 */
package MultiArray;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of elements:");
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
            for (int j = i; j < arr.length; j++) {
                if (arr[j][i] % 2 != 0) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}




