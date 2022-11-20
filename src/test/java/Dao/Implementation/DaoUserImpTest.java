package Dao.Implementation;

import Entity.Role;
import Entity.User;
import Util.BDUtil;
import jakarta.persistence.Query;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DaoUserImpTest {

    @Test
    void activeUser() {
    }

    @Test
    void disabledUser() {
    }

    @Test
    void checkEmailAndPassword() {
    }

    @Test
    void loginWithRoleAdministrator() {
        // Prepare Data
        String email = "jamal@gmail.com";
        String password = "1234";
        User user = new User();
        BDUtil.openDB();
        String sql = "select user from User user where user.email =:email and user.password =:password";
        Query query = BDUtil.getEntityManager().createQuery(sql, User.class);

        query.setParameter("email", email);
        query.setParameter("password", password);
        user =(User) query.getSingleResult();
//            assertThrows(Class<User>,(User)query.getSingleResult());
            assertEquals(Role.Administrator, user.getRole());
    }
    @Test
    void loginWithRoleSuperAdmin() {
        // Prepare Data
        String email = "super@gmail.com";
        String password = "1234";
        User user = new User();
        BDUtil.openDB();
        String sql = "select user from User user where user.email =:email and user.password =:password";
        Query query = BDUtil.getEntityManager().createQuery(sql, User.class);

        query.setParameter("email", email);
        query.setParameter("password", password);
        user =(User) query.getSingleResult();
        assertEquals(Role.SuperAdmin, user.getRole());
    }


    @Test
    void logOut() {
    }
}