package Service.Implimentation;

import Dao.Implementation.DaoParticipantImp;
import Dao.Implementation.DaoResponsableImp;
import Dao.Interface.IDao;


import Entity.Responsable;
import Service.Interface.ServiceInterface;

import java.util.List;

public class ServiceResponsableImp implements ServiceInterface<Responsable> {

    IDao daoResponsableImp = new DaoResponsableImp();


    @Override
    public void insert(Responsable o) {
        DaoResponsableImp daoResponsableImp = new DaoResponsableImp();
        daoResponsableImp.insert(o);
    }

    @Override
    public void delete(Responsable o) {

    }

    @Override
    public List<Responsable> findAll() {

        IDao daoResponsableImp = new DaoResponsableImp();
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
