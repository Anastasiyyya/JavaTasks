package Дополнительно;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2etc {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.print(arr[i] + " ");
        }
//2)Найти среднее арифметическое элементов с нечетными номерами.
        double average1 = 0;
        for (int i = 0; i <= arr.length; i += 2) {
            average1 += arr[i];
        }
        System.out.println("\n" + average1 / 3);

//3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.
        double average2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                average2 += arr[i];
                count++;
            }
        }
        System.out.println(average2 / count + "\n"); //среднее арифм чисел > 5
//4)Найти наименьший нечетный элемент.
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (n > arr[i]) {
                if (arr[i] % 2 != 0) {
                    n = arr[i];
                }
            }
        }
        System.out.println(n);
//6) Проверить, различны ли все элементы массива.
        boolean bool = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    bool = false;
                    System.out.println("\n" + "Array has duplicate element: " + arr[j]);
                }
            }
        }
        if (bool) {
            System.out.println("There are no duplicate elements in the array");
        }
//7) Подсчитать, сколько раз встречается элемент с заданным значением.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element:");
        int el = sc.nextInt();
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                count1++;
            }
        }
        System.out.println("\n" + "Element " + el + " occurs " + count1 +  " times ");
//8) Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }else if (arr[i] > max2){
                max2 = arr[i];
                }
        }
        System.out.println("\n" + "Maximum array element: " + max1);
        System.out.println("\n" + "The second maximum array element: " + max2);

//9) Найти наименьший элемент среди элементов с четными индексами массива
        int min = arr[0];
        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\n" + "Manimum array element: " + min);

//10) Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
        int max3 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max3) {
                max3 = arr[i];
                arr[i] = arr[0];
                arr[0] = max3;
            }
        }
        System.out.print(Arrays.toString(arr));
        }
    }





