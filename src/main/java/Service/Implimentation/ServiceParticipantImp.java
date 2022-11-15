package Service.Implimentation;

import Dao.Implementation.DaoParticipantImp;
import Dao.Implementation.DaoResponsableImp;
import Dao.Interface.IDao;
import Entity.Participant;
import Service.Interface.ServiceInterface;
import Service.Interface.ServiceParticipant;

import java.util.List;

public class ServiceParticipantImp implements ServiceInterface<Participant> {

    @Override
    public void insert(Participant o) {

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

    }
}
