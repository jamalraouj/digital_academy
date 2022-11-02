package Dao.Interface;

import Entity.User;

public interface DaoUser<T>  {

    boolean save(T o);

    boolean activeUser(T o);

    boolean disabledUser(T o);

    boolean checkUsername(String username);


    boolean checkEmail(String email);

    boolean checkPassword(String password);

    boolean checkUsernameAndPassword(T o);

    User login(String email , String password);

}
