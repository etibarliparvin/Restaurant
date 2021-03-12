package inter;

import entity.Product;

import java.util.List;

public interface ProductDaoInter {

    public List<Product> getAll();

    public Product getById(int id);

    public boolean updateProduct(Product p);

    public boolean addProduct(Product p);

    public boolean removeProduct(int id);

}
