package Service.Interface;

import Entity.User;

public interface UserService {
    User doLogin(String email , String password);
}
