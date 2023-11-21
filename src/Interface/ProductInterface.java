package Interface;

import Interface.Imple.ProductInterfaceImple;
import Model.Product;

import java.math.BigDecimal;

public interface ProductInterface {
    public void insertProduct(Product product);
    public void findById(Long id);
    public void updateProduct(Long id, Product newProduct);
    public void deleteProduct(Long id);
    public Product[] getAllProductsSortedByName();
    public Product[] getProductByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
}
