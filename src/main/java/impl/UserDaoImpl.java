package impl;

import entity.User;
import inter.AbstractDao;
import inter.UserDaoInter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends AbstractDao implements UserDaoInter {

    private User getUser(ResultSet rs) throws Exception {
        int id = rs.getInt("user_id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String userCode = rs.getString("user_code");
        double bonus = rs.getDouble("bonus");
        Date createdAt = rs.getDate("created_at");
        Date modifiedAt = rs.getDate("modified_at");
        return new User(id, name, surname, userCode, bonus, createdAt, modifiedAt);
    }

    @Override
    public List<User> getAll() {
        List<User> result = new ArrayList<>();
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from user");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                result.add(getUser(rs));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public User getById(int id) {
        User result = null;
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from user where user_id = " + id);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                result = getUser(rs);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean updateUser(User u) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update user set name = ?, surname = ?, user_code = ?, " +
                    "bonus = ?, created_at = ?, modified_at = ? where user_id = ?");
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getSurname());
            stmt.setString(3, u.getUserCode());
            stmt.setDouble(4, u.getBonus());
            stmt.setDate(5, u.getCreatedAt());
            stmt.setDate(6, u.getModifiedAt());
            stmt.setInt(7, u.getUserId());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addUser(User u) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("inser into user (name, surname, user_code, bonus, created_at, modified_at) " +
                    "values(?, ?, ?, ?, ?, ?)");
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getSurname());
            stmt.setString(3, u.getUserCode());
            stmt.setDouble(4, u.getBonus());
            stmt.setDate(5, u.getCreatedAt());
            stmt.setDate(6, u.getModifiedAt());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeUser(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from user where user_id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
