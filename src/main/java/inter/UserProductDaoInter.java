package inter;

import java.util.List;

public interface UserProductDaoInter {

    public List<UserProductDaoInter> getAll();

    public UserProductDaoInter getById(int id);

    public boolean add(UserProductDaoInter up);

    public boolean remove(int id);

}
