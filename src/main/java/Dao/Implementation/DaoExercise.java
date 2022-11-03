package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Activity;
import Entity.Exercise;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.LinkedList;
import java.util.List;

public class DaoExercise implements IDao<Exercise> {

    @Override
    public boolean delete(Exercise o) {
        BDUtil.openDB();
        String sql = "DELETE FROM Exercise WHERE id =:id";
        try {
            Query query = BDUtil.getEntityManager().createQuery(sql, Exercise.class);
            query.setParameter("id", o.getId());
            query.executeUpdate();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Exercise> findAll() {
        List<Exercise> listExercise = new LinkedList<>();
        try{
            BDUtil.openDB();
            String sql = "select exercises from Exercise exercises";
            Query query = BDUtil.getEntityManager().createQuery(sql, Exercise.class);
            listExercise=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        BDUtil.closeDB();
        return  listExercise;
    }

    @Override
    public boolean insert(Exercise o) {
        try{
            BDUtil.openDB();
            BDUtil.getEntityManager().persist(o);
            return true;
        }
        catch(Exception e){
            e.getMessage();
            return  false;
        }

    }

    @Override
    public boolean update(Exercise o) {

        return false;
    }
}
