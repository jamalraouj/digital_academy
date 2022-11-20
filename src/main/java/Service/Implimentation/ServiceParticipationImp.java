package Service.Implimentation;

import Dao.Implementation.DaoParticipationImp;
import Dao.Interface.IDao;
import Entity.Participant;
import Entity.Participation;
import Service.Interface.ServiceInterface;

import java.util.List;

public class ServiceParticipationImp implements ServiceInterface<Participation> {
    @Override
    public Participation insert(Participation o) {
        IDao participationImp = new DaoParticipationImp();
        participationImp.insert(o);
        return o;
    }

    @Override
    public void delete(Participation o) {

    }

    @Override
    public List<Participation> findAll() {
        return null;
    }

    @Override
    public void update(Participation o) {

    }

    @Override
    public Participation findById(long t) {
        return null;
    }
}
