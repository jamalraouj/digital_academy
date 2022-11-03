package Dao.Implementation;

import Entity.Person;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

public class DaoSuperAdminImp {


    public User login(String email, String password) {
        User user = new User();
        BDUtil.openDB();
        String sql = "select user from User user where user.email =:email and user.password =:password";
        Query query = BDUtil.getEntityManager().createQuery(sql, Person.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        try {
            user= (User)query.getSingleResult();
        }catch (Exception e){
            e.getMessage();
        }
        return  user;
    }

}
