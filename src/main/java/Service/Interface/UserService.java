package Service.Interface;

import Entity.Person;

public interface UserService {
    Person doLogin(String email , String password);
}
