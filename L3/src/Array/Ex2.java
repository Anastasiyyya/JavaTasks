package Array;

/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 … 7 5 3 1).
 */
public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int i = 0;
        int j = 0;
        int p = 1;
        int s = 99;
        while (i < 50) {
            arr[i] = p;
            p += 2;
            i++;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (i = arr.length - 1; i >= 0 ; i-=1){
            System.out.print(arr[i] + " ");
        }
    }
}
