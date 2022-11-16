package Service.Implimentation;

import Dao.Implementation.DaoActivity;
import Dao.Implementation.DaoParticipantImp;
import Dao.Interface.IDao;
import Entity.Activity;
import Entity.Participant;
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
        IDao daoActivity = new DaoActivity();
        return daoActivity.findAll();


    }

    @Override
    public void update(Activity o) {
        IDao daoActivity = new DaoActivity();
        daoActivity.update(o);
    }

    @Override
    public Activity findById(long t) {
        IDao daoActivity=new DaoActivity();
        return (Activity) daoActivity.findById(t);
    }
}
