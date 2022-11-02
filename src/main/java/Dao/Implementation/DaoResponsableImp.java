package Dao.Implementation;

import Dao.Interface.DaoUser;
import Dao.Interface.IDao;
import Entity.Responsable;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class DaoResponsableImp implements DaoUser<Responsable> , IDao<Responsable>
{

    @Override
    public boolean delete(Responsable o) {
        return true;
    }

    @Override
    public List<Responsable> findAll() {
        List<Responsable> listResp =new ArrayList<>();
        try{
            BDUtil.openDB();
            String sql = "select resp from Responsable resp";
            Query query = BDUtil.getEntityManager().createQuery(sql, User.class);
            listResp=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        return  listResp;
    }

    @Override
    public boolean insert(Responsable o) {
        try{
            BDUtil.openDB();
            BDUtil.getEntityManager().persist(o);
        }
        catch(Exception e){
            e.getMessage();
        }
        return true;
    }

    @Override
    public boolean update(Responsable o) {
//        BDUtil.openDB();
//        String sql = "update Responsable responsable set responsable.Status=?1,responsable.email=?2,responsable.name=?3," +
//                "responsable.password=?4,responsable.phone=?5,responsable.role=?6,responsable.TypeResp=?7,responsable.domaine=?8 where responsable.id=?9";
//        Query query = BDUtil.getEntityManager().createQuery(sql, User.class);
//        query.setParameter(1,o.getStatus());
//        query.setParameter(2,o.getEmail());
//        query.setParameter(3,o.getName());
//        query.setParameter(4,o.getPassword());
//        query.setParameter(5,o.getPhone());
//        query.setParameter(6,o.getRole());
//        query.setParameter(7,o.getTypeResp());
//        query.setParameter(8,o.getDomaine());
//        query.setParameter(9,o.getId());
//        query.getSingleResult();


        return true;
    }

    @Override
    public boolean save(Responsable o) {
        return false;
    }

    @Override
    public boolean activeUser(Responsable o) {
        BDUtil.openDB();
        Responsable r=new Responsable();
        r=BDUtil.getEntityManager().find(Responsable.class,o.getId());
        r.setStatus(true);
        BDUtil.getEntityManager().merge(r);
        return false;
    }


    @Override
    public boolean disabledUser(Responsable o) {
        return false;
    }

    @Override
    public boolean checkUsername(String username) {
        return false;
    }

    @Override
    public boolean checkEmail(String email) {
        return false;
    }

    @Override
    public boolean checkPassword(String password) {
        return false;
    }

    @Override
    public boolean checkUsernameAndPassword(Responsable o) {
        return false;
    }

    @Override
    public User login(String email, String password) {
        return null;
    }

    public void findById(long id){
        Responsable r=new Responsable();
        r=BDUtil.getEntityManager().find(Responsable.class,id);
        System.out.println(r.toString());

    }

}
