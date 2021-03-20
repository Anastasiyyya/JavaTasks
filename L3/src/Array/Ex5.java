package Array;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
 */
public class Ex5 {
    public static void main(String[] args) {
        int[] arr1 =  new int [5];
        int[] arr2 =  new int [5];
        double average1 = 0;
        double average2 = 0;
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random() * 16);
            System.out.print(arr1[i] + "\t");
            average1 += arr1[i];
        }
        System.out.print("|" + average1/arr1.length);
        System.out.println();

        for (int i = 0; i < arr2.length; i++){
            arr2[i] = (int) (Math.random() * 15);
            System.out.print(arr2[i] + "\t");
            average2 += arr2[i];
        }
        System.out.print("|" + average2/arr2.length);
        System.out.println();
        if (average1 > average2){
            System.out.println("Average arr1 = " + average1/arr1.length + " > " + "Average arr2 = " + average2/arr2.length);
        } else if (average1/arr1.length < average2/arr2.length){
            System.out.println("Average arr1 = " + average1/arr1.length + " < " + "Average arr2 = " + average2/arr2.length);
        } else {
            System.out.println("Average arr1 =  Average arr2 = " + average2/arr2.length);
        }
    }
}
