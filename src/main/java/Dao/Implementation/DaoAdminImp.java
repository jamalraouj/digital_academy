package Dao.Implementation;
import java.util.ArrayList;
import Dao.Interface.DaoUser;
import Entity.Responsable;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class DaoAdminImp implements DaoUser<User> {


    @Override
    public void activeUser(User o) {
        BDUtil.openDB();
        User r=new User();
        r=BDUtil.getEntityManager().find(User.class,o.getId());
        r.setStatus(true);
        BDUtil.getEntityManager().merge(r);
    }

    @Override
    public void disabledUser(User o) {
        BDUtil.openDB();
        User r=new User();
        r=BDUtil.getEntityManager().find(User.class,o.getId());
        r.setStatus(false);
        BDUtil.getEntityManager().merge(r);
    }


    @Override
    public boolean checkUsernameAndPassword(User o) {

        return false;
    }

    public User login(String email, String password) {
        User u = new User();
        BDUtil.openDB();
        String sql = "select user from User user where user.email =:email and user.password =:password";
        Query query = BDUtil.getEntityManager().createQuery(sql, User.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        try {
            u= (User)query.getSingleResult();
        }catch (Exception e){
            e.getMessage();
        }

        return  u;
    }






}
