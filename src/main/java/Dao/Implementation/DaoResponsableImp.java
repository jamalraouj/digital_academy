package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Responsable;
import Entity.Person;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class DaoResponsableImp implements  IDao<Responsable>
{
    @Override
    public Responsable findById(long id){
        Responsable r=null;
        r=BDUtil.getEntityManager().find(Responsable.class,id);

        return r;
    }


    @Override
    public List<Responsable> findAll() {
        List<Responsable> listResp =new ArrayList<>();
        try{
            BDUtil.openDB();
            String sql = "select resp from Responsable  resp";
            Query query = BDUtil.getEntityManager().createQuery(sql, Responsable.class);
            listResp=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        return  listResp;
    }

    @Override
    public Responsable insert(Responsable o) {
        try{
            BDUtil.openDB();
            BDUtil.getEntityManager().persist(o);
        }
        catch(Exception e){
            e.getMessage();
        }
        return o;
    }

    @Override
    public boolean update(Responsable o) {
        BDUtil.openDB();
        Responsable r=new Responsable();
        r=BDUtil.getEntityManager().find(Responsable.class,o.getId());
        r.setName(o.getName());
        r.setPhone(o.getPhone());
        r.setRole(o.getRole());
        r.setDomaine(o.getDomaine());
        r.setTypeResp(o.getTypeResp());
        BDUtil.getEntityManager().merge(r);
        return true;
    }



}
