/*
Найти произведение элементов, кратных 3.
 */
package Дополнительно;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.print(arr[i] + " ");
            if (arr[i] % 3 == 0) {
                mult *= arr[i];
            }
        }
        System.out.println();
        if (mult == 1) {
            System.out.println("Нет чисел, кратных 3!");
        }else {
            System.out.println(mult);
        }
    }
}
