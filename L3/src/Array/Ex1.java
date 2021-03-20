package Array;

/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int p = 2;
        for (int i = 0; i < arr.length; i++){
            arr[i] = p;
            p+=2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
