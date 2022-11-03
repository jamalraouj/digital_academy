package Dao.Implementation;

import Dao.Interface.DaoUser;
import Entity.Person;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

public class DaoUserImp implements DaoUser<User> {


    @Override
    public void activeUser(User o) {

    }

    @Override
    public void disabledUser(User o) {

    }

    @Override
    public boolean checkEmailAndPassword(User o) {
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
                user= (User)query.getSingleResult();
                System.out.println("================"+user.getName());
            }catch (Exception e){
                e.getMessage();
            }
            return  user;
    }

    @Override
    public boolean logOut() {
        return false;
    }
}
