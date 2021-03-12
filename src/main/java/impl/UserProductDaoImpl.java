package impl;

import entity.UserProduct;
import inter.AbstractDao;
import inter.UserProductDaoInter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UserProductDaoImpl extends AbstractDao implements UserProductDaoInter {

    @Override
    public boolean add(UserProduct up) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into user_product (user_id, product_id) values (?, ?)");
            stmt.setInt(1, up.getUserId().getUserId());
            stmt.setInt(2, up.getProductId().getProdictId());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from user_product where user_product_id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
