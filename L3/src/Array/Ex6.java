package Array;

import java.util.Arrays;

/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
 */
public class Ex6 {
    public static void main(String[] args) {
        int[] a = new int[4];
        boolean bool = true;
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; i++){
            if (a[i-1] > a[i] | a[i-1] == a[i]){
                bool = false;
            }
        }
        if (bool){
            System.out.println("Массив является возрастающей последовательностью!");
        }else {
            System.out.println("Массив не является возрастающей последовательностью!");
        }
    }
}
