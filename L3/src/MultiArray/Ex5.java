/*
Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)
 */
package MultiArray;

import java.util.Scanner;

public class Ex5 {
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
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + "\t");
                }
            System.out.println();
            }
        }
    }

