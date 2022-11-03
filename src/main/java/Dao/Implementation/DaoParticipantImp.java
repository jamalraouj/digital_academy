package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Participant;
import Entity.Person;
import Util.BDUtil;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class DaoParticipantImp implements IDao<Participant> {

    @Override
    public Participant findById(long id) {
        Participant p=new Participant();
        p=BDUtil.getEntityManager().find(Participant.class,id);
        return p;
    }

    @Override
    public List<Participant> findAll() {
        List<Participant> listPart =new ArrayList<>();
        try{
            BDUtil.openDB();
            String sql = "select part from Participant  part";
            Query query = BDUtil.getEntityManager().createQuery(sql, Participant.class);
            listPart=query.getResultList();
        }
        catch(Exception e){
            e.getMessage();
        }
        return  listPart;
    }

    @Override
    public void insert(Participant o) {
        try{
            BDUtil.openDB();
            BDUtil.getEntityManager().persist(o);
        }
        catch(Exception e){
            e.getMessage();
        }
    }

    @Override
    public boolean update(Participant o) {
        BDUtil.openDB();
        Participant p=new Participant();
        p=BDUtil.getEntityManager().find(Participant.class,o.getId());
        p.setName(o.getName());
        p.setPhone(o.getPhone());
        p.setRole(o.getRole());
        BDUtil.getEntityManager().merge(p);
        return true;
    }


}
