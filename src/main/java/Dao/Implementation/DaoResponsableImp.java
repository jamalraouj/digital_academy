package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Responsable;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class DaoResponsableImp implements IDao<Responsable>
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
//        String sql = "update Responsable r set r.Status=?1,r.email=?2,r.name=3,r.password=?4,r.phone=?5,r.role=?6,r.TypeResp=?7,r.domaine=?8 where r.id=?9";
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
//        query.executeUpdate();
        return true;
    }
}
