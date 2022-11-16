import Dao.Implementation.DaoActivity;
import Dao.Implementation.DaoParticipantImp;
import Dao.Implementation.DaoParticipationImp;
import Entity.*;
import Util.BDUtil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {




        DaoActivity daoActivity = new DaoActivity();

        DaoParticipantImp daoParticipantImp1 = new DaoParticipantImp();
        Participant p2=daoParticipantImp1.findById(602);
        Participant p3=daoParticipantImp1.findById(302);

        System.out.println(p2.toString());
        Activity a2 = daoActivity.findById(4);
        System.out.println(a2.toString());
//        daoActivity.insert(a1);
        System.out.println(daoActivity.findAll().toString());
        Participation part=new Participation();
        part.setActivity(a2);
        part.setParticipant(p2);
        BDUtil.openDB();
        BDUtil.getEntityManager().persist(part);
        BDUtil.closeDB();
        System.out.println(part.toString());
        System.out.println(p2);

        DaoParticipationImp daoParticipationImp=new DaoParticipationImp();
        System.out.println("=========------!!!!!========");
        System.out.println(daoParticipationImp.findParticipantActivity(4));




        //===============================

//        DaoResponsableImp daoResponsableImp=new DaoResponsableImp();
//        Responsable r=new Responsable();
//        r.setName("saida");
//        r.setPhone("6786876987");
//        r.setDomaine("info");
//
//
//        r.setTypeResp(Formateur);
//        BDUtil.getEntityManager().persist(r);
//
//
//
//
//        Responsable r1=new Responsable();
//        r1.setName("jamal");
//        r1.setPhone("6786876987");
//        r1.setDomaine("info");
//        r1.setTypeResp(Formateur);
//        BDUtil.getEntityManager().persist(r1);
//        User u = new User();
//        u.setName("jamal");
//        u.setPhone("6786876987");
//        u.setEmail("jamal@gmail.com");
//        u.setPassword("1234");
//        u.setRole(Role.Administrator);
//        BDUtil.getEntityManager().persist(u);
//
//        Responsable r2=new Responsable();
//        r2.setName("raouia");
//        r2.setPhone("6786876987");
//        r2.setDomaine("info");
//        r2.setTypeResp(Formateur);





//        Participant r1=new Participant();
//        r1.setName("jamal");
//        r1.setPhone("6786876987");
//        daoParticipantImp.insert(r1);
//
//        Participant r2=new Participant();
//        r2.setName("raouia");
//        r2.setPhone("6786876987");
//        daoParticipantImp.insert(r2);

       // System.out.println("name "+BDUtil.getEntityManager().find(Person.class,1).getName());


//        System.out.println(daoParticipantImp.findAll());
//

//        DaoActivity daoActivity = new DaoActivity();
//        Activity a1=new Activity();
//        a1.setTitle("first activity");
//        a1.setStatus(Status.enCours);
//        a1.setDess("ssssssssssssssss");
//        a1.setType(Type.Evenement);
//        a1.setStartDate(LocalDate.of(2022,11,02));
//        a1.setEndDate(LocalDate.of(2022,11,05));
//        daoActivity.insert(a1);
//        System.out.println(daoActivity.findAll().toString());
//        BDUtil.getEntityManager().createQuery("select user from User user",User.class).getResultList().stream().map(u->u.getName()).forEach(System.out::println)
//        BDUtil.closeDB();
//        ImpDaoUser impDaoUser = new ImpDaoUser();
//        User user = impDaoUser.login("saida@gmail.com","12345");
//        System.out.println(user.toString());


        //===============================

    }
}

