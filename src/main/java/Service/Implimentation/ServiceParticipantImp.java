package Service.Implimentation;

import Dao.Implementation.DaoParticipantImp;
import Dao.Interface.IDao;
import Entity.Participant;
import Entity.Participation;
import Service.Interface.ServiceInterface;

import java.util.List;

public class ServiceParticipantImp implements ServiceInterface<Participant> {

    @Override
    public Participant insert(Participant o) {
        IDao daoParticipantImp=new DaoParticipantImp();
        daoParticipantImp.insert(o);
        return o;
    }

    @Override
    public void delete(Participant o) {

    }

    @Override
    public List<Participant> findAll() {
        IDao daoParticipantImp = new DaoParticipantImp();
        return daoParticipantImp.findAll();
    }

    @Override
    public void update(Participant o) {
        IDao daoParticipantImp = new DaoParticipantImp();
        daoParticipantImp.update(o);
    }

    @Override
    public Participant findById(long t) {
        IDao daoParticipant=new DaoParticipantImp();
        return (Participant) daoParticipant.findById(t);
    }
}
