package Dao.Interface;

import Entity.Person;
import Entity.User;

public interface DaoUser<T>  {

    void activeUser(T o);

    void disabledUser(T o);

    boolean checkEmailAndPassword(T o);

    User login(String email , String password);
    boolean logOut();

}
