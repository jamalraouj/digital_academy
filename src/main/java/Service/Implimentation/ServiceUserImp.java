package Service.Implimentation;

import Dao.Implementation.DaoUserImp;
import Dao.Interface.DaoUser;
import Entity.Person;
import Entity.User;
import Service.Interface.UserService;


public class ServiceUserImp implements UserService {
    DaoUser daoUserImp = new DaoUserImp() {
    };

    @Override
    public User doLogin(String email, String password) {
        // contenue create person entity  , user , admin super admin
        return daoUserImp.login(email, password);
    }
}
