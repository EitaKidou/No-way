package Interface.Imple;

import Model.Product;

import java.util.Arrays;

public class DataBase {

    private Product[] products;

    public DataBase(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
