package Array;

import java.util.Arrays;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.
 */
public class Ex8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        double[] c = new double[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 10);
            b[i] = (int) (Math.random() * 10);
            c[i] = (double) a[i] / b[i];
        }
        int integer = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 1 == 0) {
                integer++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println("Количество целых элементов массиве c: " + integer);
    }
}
