import by.gsu.pmslab.Product;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {

    public static void main(String[] args) {
        Product[] products = {
                new Product("Milk", true, 112),
                new Product("Oil", false, 181),
                new Product("Cheese", true, 478),
                new Product("Fish", false, 345),
                new Product("Tomato", true, 125),
                new Product("Bread", true, 98),
                new Product("Eggs", true, 128),
                new Product("Potato", true, 264),
                new Product("Butter", false, 223),
                new Product("Pasta", true, 142),
        };

        System.out.println("\tInit array:");
        show(products);

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println("\n\tSort by price:");
        show(products);

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\n\tSort by name:");
        show(products);

        int sum=+countPrice(products);

        System.out.println("\n\tTotal cost product = "+ by.gsu.pmslab.Byn.toBYN(sum));

        System.out.println("\tProduct in stock = "+countStock(products));
    }

    private static void show(Product[] array){
        for (Product item : array){
            System.out.println(item);
        }
    }
    private static int countPrice(Product[] array){
        int cents = 0;
        for (Product item : array){
            cents += item.getPrice();
        }
        return cents;
    }
    private static int countStock(Product[] array){
        int num = 0;
        for (Product item : array){
            if (item.isStock()){
                num++;
            }
        }
        return num;
    }
}

