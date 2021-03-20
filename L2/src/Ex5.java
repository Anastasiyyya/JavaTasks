/*
Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Ex5 {
    public static void main(String[] args) {
        double d = 2.54;
        System.out.print("Дюйм\tСантиметр\n");
        double s = 0;
        for (int i = 1; i <= 20; i++){
            s = i * d;
            System.out.println(i + "\t\t" + s);
        }
    }
}
