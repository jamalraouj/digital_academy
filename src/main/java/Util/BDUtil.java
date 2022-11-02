package Util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BDUtil {
     private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("digital_academy");
     private static EntityManager entityManager = entityManagerFactory.createEntityManager();
     public static boolean openDB(){
         try {
             entityManager.getTransaction().begin();
             return true;
         }
         catch (Exception e){
             return false;
         }

    }
    public static void closeDB(){
        entityManager.getTransaction().commit();

    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        BDUtil.entityManagerFactory = entityManagerFactory;
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManager) {
        BDUtil.entityManager = entityManager;
    }
}
