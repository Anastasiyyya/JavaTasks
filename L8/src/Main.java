import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int input;
        boolean b = true;

        do {
            try {
                System.out.println("Выберите действие (Введите цифру): " +
                        "\n 1. Вывод всех товаров" +
                        "\n 2. Добавление товара" +
                        "\n 3. Удаление товара" +
                        "\n 4. Редактирвание товара" +
                        "\n 5. Выход");
                input = sc.nextInt();
                switch (input) {
                    case 1:
                        shop.getListOfProducts();
                        break;
                    case 2:
                        shop.addProduct(scanner);
                        break;
                    case 3:
                        shop.removeProduct(scanner);
                        break;
                    case 4:
                        shop.editProduct(scanner);
                        break;
                    case 5:
                        System.out.println("Завершение работы магазина.");
                        b = false;
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Введите число!!!");
                b = false;
            }
        } while (b);{
        }
    }
}

