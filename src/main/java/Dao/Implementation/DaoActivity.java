package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Activity;
import Entity.Participant;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.LinkedList;
import java.util.List;

public class DaoActivity implements IDao<Activity> {

    public boolean delete(Activity o) {
        BDUtil.openDB();
        String sql = "DELETE FROM Activity WHERE id =:id";
        try {
            Query query = BDUtil.getEntityManager().createQuery(sql, Activity.class);
            query.setParameter("id", o.getId());
            query.executeUpdate();
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public Activity findById(long id) {
        Activity a;
        a=BDUtil.getEntityManager().find(Activity.class,id);
        return a;
    }

    @Override
    public List<Activity> findAll() {
        List<Activity> listActivity = new LinkedList<>();
        try{
            BDUtil.openDB();
            String sql = "select activities from Activity activities";
            Query query = BDUtil.getEntityManager().createQuery(sql, Activity.class);
            listActivity=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        BDUtil.closeDB();
        return  listActivity;
    }

    @Override
    public void insert(Activity o) {
        try{
            BDUtil.openDB();
            BDUtil.getEntityManager().persist(o);
            BDUtil.closeDB();
        }
        catch(Exception e){
            e.getMessage();
        }

    }

    @Override
    public boolean update(Activity o) {
//        try{
            BDUtil.openDB();
            Activity act;
            act = BDUtil.getEntityManager().find(Activity.class , o.getId());
        System.out.println(act);
            act.setTitle(o.getTitle());
            act.setType(o.getType());
            act.setDess(o.getDess());
            act.setStatus(o.getStatus());
            act.setResponsable(o.getResponsable());
            act.setStartDate(o.getStartDate());
            act.setEndDate(o.getEndDate());
            System.out.println(act);
            BDUtil.getEntityManager().merge(act);
//BDUtil.closeDB();
//            return true;
//        }
//        catch(Exception e){
//            e.getMessage();
//
//        }
        return  false;
    }
}
