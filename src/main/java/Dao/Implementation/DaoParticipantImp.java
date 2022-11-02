package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Participant;
import Entity.Responsable;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class DaoParticipantImp implements IDao<Participant> {

    @Override
    public boolean delete(Participant o) {
        return false;
    }

    @Override
    public List<Participant> findAll() {
        List<Participant> listResp =new ArrayList<>();
        try{
            BDUtil.openDB();
            String sql = "select part from Participant  part";
            Query query = BDUtil.getEntityManager().createQuery(sql, User.class);
            listResp=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        return  listResp;
    }

    @Override
    public boolean insert(Participant o) {
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
    public boolean update(Participant o) {
        return false;
    }
}
