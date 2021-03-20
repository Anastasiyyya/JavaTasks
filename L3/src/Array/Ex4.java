package Array;

/*
Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0;  i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21);
            System.out.print(arr[i] + "\t");
        }
        for (int i = 1; i < arr.length; i+=2){
            arr[i] = 0;
        }
        System.out.println();
        for (int a: arr){
            System.out.print(a + "\t");
        }
    }
}
