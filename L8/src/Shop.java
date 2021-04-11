import java.util.*;

import static java.util.Comparator.reverseOrder;

public class Shop extends Product{
    ArrayList<Product> productList =  new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    public Shop(){
    }

    public Shop(int id, String name, double price){
        super(id, name, price);
    }

    Scanner scanner =  new Scanner(System.in);

    public void addProduct(Scanner scanner) {
        Product prod = new Product();
        System.out.println("Введите id: ");
        int in = scanner.nextInt();
        set.add(in);
        System.out.println("Введите name: ");
        prod.setName(scanner.next());
        System.out.println("Введите price: ");
        prod.setPrice(scanner.nextDouble());

        System.out.println("Set: " + set.size());
        System.out.println("List: " + productList.size());

        if (set.size() <= productList.size()) {
            productList.add(prod);
            productList.removeIf(p -> getId() == p.getId());
            System.out.println("Товар с таким id уже существует");
        } else {
            prod.setId(in);
            productList.add(prod);
            System.out.println("Товар добавлен");
        }
    }

    public void getListOfProducts(){
        int sort;
        System.out.println("Выберите вариант сортировки: " +
                "\n 1. По добавлению(сначала новые)" +
                "\n 2. По цене(по возрастанию)" +
                "\n 3. По цене(по убыванию)");
        sort = scanner.nextInt();
        ArrayList<Product> copyList = (ArrayList)productList.clone();
        switch (sort){
            case 1:
                Collections.reverse(copyList);
                System.out.println(copyList + "\n");
                break;
            case 2:
                copyList.sort((o1, o2) -> (int) (o1.getPrice()- o2.getPrice()));
                System.out.println(copyList + "\n");
                break;
            case 3:
                copyList.sort((o1, o2) -> (int) (o2.getPrice()- o1.getPrice()));
                System.out.println(copyList  + "\n");
                break;
        }
    }

    public void removeProduct(Scanner scanner){

        System.out.println("Введите id удаляемого товара: ");
        setId(scanner.nextInt());
        productList.removeIf(p -> getId() == p.getId());
    }

    public void  editProduct(Scanner scanner){
        System.out.println("Выберите id товара для редактирования: ");
        int editId = scanner.nextInt();
        Product prod = new Product();
        prod.setId(editId);
        for (Product p: productList){
            if (p.equals(prod)){
                //System.out.println(productList.indexOf(p));
                System.out.println("Введите новое имя:");
                prod.setName(scanner.next());
                System.out.println("Введите новую цену:");
                prod.setPrice(scanner.nextDouble());
                productList.set(productList.indexOf(prod),prod);
            }
        }
    }
}

