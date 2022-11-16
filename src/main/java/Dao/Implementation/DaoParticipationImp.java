package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Participant;
import Entity.Participation;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DaoParticipationImp implements IDao<Participation> {
    @Override
    public Participation findById(long id) {
        return null;
    }

    @Override
    public List<Participation> findAll() {
        List<Participation> listParticipation = new LinkedList<>();
        try{
            BDUtil.openDB();
            String sql = "select Part from Participation part";
            Query query = BDUtil.getEntityManager().createQuery(sql, Participation.class);
            listParticipation=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        BDUtil.closeDB();
        return  listParticipation;
    }

    @Override
    public void insert(Participation o) {
        System.out.println("PPPPPPPPPPPPPPPPPPPPP"+o);
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
    public boolean update(Participation o) {
        return false;
    }

    public List<Participant> findParticipantActivity(long id){
        List<Participant> listPart =new ArrayList<>();
        try{
            BDUtil.openDB();
            String sql = "SELECT p FROM Participant p  WHERE EXISTS ( SELECT pt FROM Participation pt where p.id = pt.participant.id AND pt.activity.id= :id ) ";
            Query query = BDUtil.getEntityManager().createQuery(sql, Participant.class);
            query.setParameter("id", id);
            listPart=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        return  listPart;
    }
}
