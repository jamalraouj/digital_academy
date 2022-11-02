package Dao.Implementation;

import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

public class DaoUserImp implements Dao.Interface.DaoUser<User> {

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean activeUser(User user) {
return true;
    }

    @Override
    public boolean disabledUser(User user) {
        return false;
    }

    @Override
    public boolean checkUsername(String username) {
        return false;
    }

    @Override
    public boolean checkEmail(String email) {
        BDUtil.openDB();

        return false;
    }

    @Override
    public boolean checkPassword(String password) {
        return false;
    }

    @Override
    public boolean checkUsernameAndPassword(User user) {
        return false;
    }

    @Override
    public User login(String email, String password) {
        User user = new User();

    BDUtil.openDB();
    String sql = "select user from User user where user.email =:email and user.password =:password";
    Query query = BDUtil.getEntityManager().createQuery(sql, User.class);
    query.setParameter("email", email);
    query.setParameter("password", password);
        try {
     user = (User)query.getSingleResult();

  }catch (Exception e){
            e.getMessage();
        }

return  user;
    }
}
