package Service.Implimentation;

import Dao.Implementation.DaoActivity;
import Dao.Interface.IDao;
import Entity.Activity;
import Service.Interface.ServiceInterface;

import java.util.List;

public class ServiceActivity implements ServiceInterface<Activity> {
    @Override
    public void insert(Activity o) {
        IDao daoActivity = new DaoActivity();
        daoActivity.insert(o);
    }

    @Override
    public void delete(Activity o) {

    }

    @Override
    public List<Activity> findAll() {
        return null;
    }

    @Override
    public void update(Activity o) {

    }
}
