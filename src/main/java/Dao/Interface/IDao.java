package Dao.Interface;

import java.util.List;

    public interface IDao<T> {
        boolean delete(T o);
        List<T> findAll();
        boolean insert(T o);
        boolean update(T o);
    }


