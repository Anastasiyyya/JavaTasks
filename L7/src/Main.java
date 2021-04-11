import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

//1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//последнего вхождения сивола(B).

        String str1 = "This is a string for first exercise.";
        System.out.println(str1.substring((str1.indexOf('i')), (str1.lastIndexOf('f')) + 1));

//2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0

        String str2 = "This is a string for second exercise.";
        char[] result = str2.toCharArray();
        System.out.println(str2.replace(result[2], result[0]));

//3)В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы


        String path = "src\\textEx3";
        File file = new File("src\\palindroms.txt");
        file.createNewFile();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
            while ((line = reader.readLine()) != null) {
                if (isPalindrome(line)) {
                    writer.write(line + "\n");
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
/*
4)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.
Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
 */
        System.out.println("----------------------------");

        TextFormater textFormater = new TextFormater();
        String path1 = "src\\textEx4";
        File file1 = new File("src\\newFile.txt");
        file1.createNewFile();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path1));
            String line;
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1.getAbsolutePath()));
            while ((line = reader.readLine()) != null) {
                if (textFormater.numberOfWords(line) <= 5 && textFormater.numberOfWords(line) >= 3 || textFormater.consistsPalindrom(line)) {
                    writer.write(line + "\n");
                }
            }
            writer.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
