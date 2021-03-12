package impl;

import entity.Product;
import inter.AbstractDao;
import inter.ProductDaoInter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl extends AbstractDao implements ProductDaoInter {

    private Product getProduct(ResultSet rs) throws Exception {
        int id = rs.getInt("product_id");
        String name = rs.getString("name");
        double price = rs.getDouble("price");
        int type = rs.getInt("type");
        String description = rs.getString("description");
        Date createdAt = rs.getDate("created_at");
        Date modifiedAt = rs.getDate("modified_at");
        return new Product(id, name, price, type, description, createdAt, modifiedAt);
    }

    @Override
    public List<Product> getAll() {
        List<Product> result = new ArrayList<>();
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from product");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                result.add(getProduct(rs));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Product getById(int id) {
        Product result = null;
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from product where product_id = " + id);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                result = getProduct(rs);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean updateProduct(Product p) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update product set name = ?, price = ?, type = ?, " +
                    "description = ?, created_at = ?, modified_at = ? where user_id = ?");
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getPrice());
            stmt.setInt(3, p.getType());
            stmt.setString(4, p.getDecription());
            stmt.setDate(5, p.getCreatedAt());
            stmt.setDate(6, p.getModifiedAt());
            stmt.setInt(7, p.getProdictId());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addProduct(Product p) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into product (name, price, type, description, created_at, modified_at) " +
                    "values (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getPrice());
            stmt.setInt(3, p.getType());
            stmt.setString(4, p.getDecription());
            stmt.setDate(5, p.getCreatedAt());
            stmt.setDate(6, p.getModifiedAt());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeProduct(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from product where product_id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
