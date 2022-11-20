package Service.Implimentation;

import Entity.Activity;
import Entity.Responsable;
import Entity.Status;
import Entity.Type;
import Service.Interface.ServiceInterface;
import jakarta.persistence.Id;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ServiceActivityTest {
// @Test
//    public void testInsert_Success() {
//        // setup
//        // Initialize test user data
//        User expected = new User();
//        // exercise
//        this.userDAO.insertUser(expected);
//        // assert
//        User actual = this.userDAO.selectUser(expected.getId());
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    void insert() {
        long id = Long.parseLong("590");
        String title ="test insert title";
        String description = "llllllllll";
        Type type = Type.Evenement;
        Status status = Status.enCours;
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.now();
        ServiceInterface<Activity> serviceActivity = new ServiceActivity();

        ServiceResponsableImp responsableImp = new ServiceResponsableImp();
        Responsable res = responsableImp.findById( 202);
        Activity activity = new Activity(title,description,type,startDate,endDate,status,res);
        Activity activity1 = serviceActivity.insert(activity);
        Activity activity2 = serviceActivity.findById(activity1.getId());
        Assertions.assertEquals(activity1,activity2);
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }
}