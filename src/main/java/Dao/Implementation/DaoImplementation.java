package Dao.Implementation;

import Dao.Interface.IDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class DaoImplementation<T> implements IDao<T> {


    @Override
    public boolean delete(T o) {

        return false;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public boolean insert(T o) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("digital_academy");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(o);
        return false;
    }

    @Override
    public boolean update(T o) {
        return false;
    }

}
