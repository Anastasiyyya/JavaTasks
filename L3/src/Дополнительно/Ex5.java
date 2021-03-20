/*
//5) «Сожмите» массив, выбросив из него каждый второй элемент.
//«Освободившиеся» места массива заполните нулями.
 */
package Дополнительно;

public class Ex5 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10-k];
        for (int i = 1; i < array1.length; i++){
            array1[i] = (int) (Math.random() * 51);
        }
        for (int a:array1){
            System.out.print(a);
        }
    }
}
