package Dao.Interface;

import java.util.List;

    public interface IDao<T> {
         T findById(long id);
        List<T> findAll();
        T insert(T o);
        boolean update(T o);

    }


