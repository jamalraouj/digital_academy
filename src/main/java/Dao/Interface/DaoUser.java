package Dao.Interface;

import Entity.User;

public interface DaoUser {

    boolean save(User user);

    void activeUser(long id);

    void disabledUser(long id);

    boolean checkUsername(String username);


    boolean checkEmail(String email);

    boolean checkPassword(String password);

    boolean checkUsernameAndPassword(User user);

    User login(String email , String password);
}
