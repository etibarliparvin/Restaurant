package impl;

import entity.UserProduct;
import inter.AbstractDao;
import inter.UserProductDaoInter;

import java.sql.ResultSet;
import java.util.List;

public class UserProductDaoImpl extends AbstractDao implements UserProductDaoInter {

    private UserProduct getUserProduct(ResultSet rs) throws Exception {
        int userProductId = rs.getInt("user_product_id");
        int userId =
    }

    @Override
    public List<UserProductDaoInter> getAll() {
        return null;
    }

    @Override
    public UserProductDaoInter getById(int id) {
        return null;
    }

    @Override
    public boolean add(UserProductDaoInter up) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }
}
