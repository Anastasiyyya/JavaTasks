/*
3)Проверить произведение элементов какой диагонали больше.
 */
package MultiArray;

import java.util.Scanner;

public class Ex3 {
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
        int mult1 = 1;
        for (int i = 0; i < arr.length; i++) {
            mult1 *= arr[i][i];
        }
        int mult2 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = in-1-i; j < arr.length; j += in) {
                mult2 *= arr[j][i];
            }
        }
        if (mult1 > mult2){
            System.out.println("Произведение элементов главной диагонали больше:");
            System.out.println(mult1 + " > " + mult2);
        }else if(mult1 < mult2){
            System.out.println("Произведение элементов главной диагонали меньше:");
            System.out.println(mult1 + " < " + mult2);
        }else {
            System.out.println(mult1 + " = " + mult2);
        }
    }
}


