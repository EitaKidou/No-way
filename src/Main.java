import Interface.Imple.DataBase;
import Interface.Imple.ProductInterfaceImple;
import Interface.ProductInterface;
import Model.Product;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product product = new Product("мандарин",120, "африканские");
        Product product1 = new Product("апельсин",110, "из антарктиды");
        Product product9 = new Product("апельсин",110, "из антарктиды");
        Product product8 = new Product("апельсин",110, "из антарктиды");
        Product product7 = new Product("апельсин",110, "из антарктиды");
        Product product2 = new Product("мясо",400, "страуса");
        Product[] products = new Product[]{product,product1,product2,product7,product8,product9};
        DataBase dataBase= new DataBase(products);
        ProductInterface productInterface = new ProductInterfaceImple(dataBase);
//        productInterface.insertProduct(new Product("банан",100, "из чунга чанга"));
//        productInterface.deleteProduct(2L);
//        productInterface.updateProduct(1L,new Product("ананас",200,"полезен перед..."));
//        System.out.println(Arrays.toString(productInterface.getAllProductsSortedByName()));
//        System.out.println(Arrays.toString(productInterface.getProductByPriceRange(new BigDecimal(120), new BigDecimal(200))));


    }
}