package Dao.Implementation;
import Dao.Interface.DaoUser;
import Entity.Person;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

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
    public boolean checkEmailAndPassword(User o) {
        return false;
    }


    public User login(String email, String password) {
        User u = new User();
        BDUtil.openDB();
        String sql = "select user from Person user where user.email =:email and user.password =:password";
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

    @Override
    public boolean logOut() {
        return false;
    }


}
