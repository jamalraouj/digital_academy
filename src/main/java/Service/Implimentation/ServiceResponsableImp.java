package Service.Implimentation;

import Dao.Implementation.DaoResponsableImp;
import Dao.Interface.IDao;
<<<<<<< HEAD
=======
import Entity.Person;
>>>>>>> main
import Entity.Responsable;
import Service.Interface.ServiceInterface;

import java.util.List;

public class ServiceResponsableImp implements ServiceInterface<Responsable> {
<<<<<<< HEAD
=======
    IDao daoResponsableImp = new DaoResponsableImp();

>>>>>>> main
    @Override
    public void insert(Responsable o) {

    }

    @Override
    public void delete(Responsable o) {

    }

    @Override
    public List<Responsable> findAll() {
<<<<<<< HEAD
        IDao daoResponsableImp = new DaoResponsableImp();
        return daoResponsableImp.findAll();
=======
        return daoResponsableImp.findAll();

>>>>>>> main
    }

    @Override
    public void update(Responsable o) {

    }
<<<<<<< HEAD
=======

    @Override
    public Responsable findById(long t) {
        return (Responsable) daoResponsableImp.findById(t);
    }
>>>>>>> main
}
