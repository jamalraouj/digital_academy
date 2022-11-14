package Service.Implimentation;

import Dao.Implementation.DaoResponsableImp;
import Dao.Interface.IDao;
import Entity.Person;
import Service.Interface.ServiceInterface;
import Util.BDUtil;

import java.util.List;

public class ServicePersonImp implements ServiceInterface<Person> {

    @Override
    public void insert(Person o) {

    }

    @Override
    public void delete(Person o) {

    }

    @Override
    public List<Person> findAll() {
        IDao daoResponsableImp = new DaoResponsableImp();
        return daoResponsableImp.findAll();

    }

    @Override
    public void update(Person o) {

    }
}
