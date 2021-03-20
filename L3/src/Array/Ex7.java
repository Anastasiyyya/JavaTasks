package Array;

import java.util.Arrays;

/*
Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.
 */
public class Ex7 {
    public static void main(String[] args) {
        int[] a = new int[12];
        int max = 0;
        int last = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 16);
            if (a[i] >= max){
                max = a[i];
                last = i;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Индекс последнего вхождения: " + last);
    }
}
