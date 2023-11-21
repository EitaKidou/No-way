package Model;

import java.math.BigDecimal;

public class Product {
    public static long idd=0 ;
    public long id;
    private String name;
    private int price;
    private String description;

    public Product(String name, int price, String description) {
        this.id = ++idd;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public static long getIdd() {
        return idd;
    }

    public static void setIdd(long idd) {
        Product.idd = idd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
