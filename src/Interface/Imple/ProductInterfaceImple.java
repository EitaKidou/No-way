package Interface.Imple;
import java.util.Arrays;
import java.util.Comparator;
import Interface.ProductInterface;
import Model.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ProductInterfaceImple implements ProductInterface {
    private DataBase dataBase;

    public ProductInterfaceImple(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public void insertProduct(Product product) {
        Product[] products = Arrays.copyOf(dataBase.getProducts(), dataBase.getProducts().length + 1);
        products[products.length - 1] = product;
        dataBase.setProducts(products);
        System.out.println(Arrays.toString(products));
    }

    @Override
    public void findById(Long id) {
        Product[] products = new Product[dataBase.getProducts().length];
        int counter = 0;
        for (Product product : dataBase.getProducts()) {
            if (product.getId() == id) {
                products[counter] = product;
                counter++;
            }
        }
        Product[] products1 = Arrays.copyOf(products, counter);
        System.out.println(Arrays.toString(products1));
    }


    @Override
    public void updateProduct(Long id, Product newProduct) {
        for (Product product : dataBase.getProducts()) {
            if (product.getId() == id) {
                product.setName(newProduct.getName());
                product.setPrice(newProduct.getPrice());
                product.setDescription(newProduct.getDescription());
                System.out.println(Arrays.toString(dataBase.getProducts()));
            }
        }
    }

    @Override
    public void deleteProduct(Long id) {
        Product[] products = new Product[dataBase.getProducts().length];
        int counter = 0;
        for (Product product : dataBase.getProducts()) {
            if (product.getId() != id) {
                products[counter] = product;
                counter++;
            }
        }
        Product[] products1 = Arrays.copyOf(products, counter);
        System.out.println(Arrays.toString(products1));
    }

    public Product[] getAllProductsFromDatabase() {
        return dataBase.getProducts();
    }

    @Override
    public Product[] getAllProductsSortedByName() {



            Product[] products = dataBase.getProducts(); // Получаем массив продуктов из базы данных

            Arrays.sort(products, Comparator.comparing(p -> p.getName().toLowerCase())); // Сортировка по имени (регистронезависимо)

            return products; // Возвращаем отсортированный массив продуктов

    }


    @Override
    public Product[] getProductByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        Product[] products = new Product[dataBase.getProducts().length];
        int counter=0;
        int a = minPrice.intValue();
        int b = maxPrice.intValue();
        for (Product product:dataBase.getProducts()) {
            if (product.getPrice()>=a && product.getPrice()<=b){
                products[counter]=product;
                counter++;
            }
        }
        Product[] products1 =Arrays.copyOf(products,counter);
        return products1;
    }

    @Override
    public String toString() {
        return "ProductInterfaceImple{" +
                "dataBase=" + dataBase +
                '}';
    }
}
