package Array;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("\n" + "Number of positive numbers: " + count);
    }
}
