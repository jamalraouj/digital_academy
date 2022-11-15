package Service.Implimentation;

import Dao.Implementation.DaoResponsableImp;
import Dao.Interface.IDao;
import Entity.Person;
import Entity.Responsable;
import Service.Interface.ServiceInterface;

import java.util.List;

public class ServiceResponsableImp implements ServiceInterface<Responsable> {
    IDao daoResponsableImp = new DaoResponsableImp();

    @Override
    public void insert(Responsable o) {

    }

    @Override
    public void delete(Responsable o) {

    }

    @Override
    public List<Responsable> findAll() {
        return daoResponsableImp.findAll();

    }

    @Override
    public void update(Responsable o) {

    }

    @Override
    public Responsable findById(long t) {
        return (Responsable) daoResponsableImp.findById(t);
    }
}
