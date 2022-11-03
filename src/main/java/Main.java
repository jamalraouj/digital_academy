import Dao.Implementation.DaoActivity;
import Dao.Implementation.DaoParticipantImp;
import Dao.Implementation.DaoResponsableImp;
import Entity.*;
import Util.BDUtil;

import static Entity.TypeResponsable.Formateur;

public class Main {
    public static void main(String[] args) {

        //===============================

        DaoResponsableImp daoResponsableImp=new DaoResponsableImp();
        Responsable r=new Responsable();
        r.setName("saida");
        r.setPhone("6786876987");
        r.setDomaine("info");


        r.setTypeResp(Formateur);
        BDUtil.getEntityManager().persist(r);




        Responsable r1=new Responsable();
        r1.setName("jamal");
        r1.setPhone("6786876987");
        r1.setDomaine("info");
        r1.setTypeResp(Formateur);
        BDUtil.getEntityManager().persist(r1);
        User u = new User();
        u.setName("jamal");
        u.setPhone("6786876987");
        u.setEmail("jamal@gmail.com");
        u.setPassword("1234");
        u.setRole(Role.Administrator);
        BDUtil.getEntityManager().persist(u);

        Responsable r2=new Responsable();
        r2.setName("raouia");
        r2.setPhone("6786876987");
        r2.setDomaine("info");
        r2.setTypeResp(Formateur);

        Responsable p=new Responsable();
        p.setId(1);
        p.setName("ahmed");
        p.setPhone("7767868");

        System.out.println("name "+BDUtil.getEntityManager().find(Person.class,1).getName());

        System.out.println("===================");
        daoResponsableImp.insert(r2);
        //  boolean res=daoResponsable.delete(r);
        //  System.out.println(res);
//        daoResponsableImp.update(p);
        System.out.println(daoResponsableImp.findAll());
        System.out.println("particpant : ==============");


//        ==================
        DaoParticipantImp daoParticipantImp=new DaoParticipantImp();
        Participant r4=new Participant();
        r4.setName("khadija");
        r4.setPhone("6786876987");
        daoParticipantImp.insert(r4);
//        ==================


//        Participant r3=new Participant();
//        r3.setName("saidaAAAA");
//        r3.setPhone("6786876987");
//        BDUtil.getEntityManager().persist(r3);
        System.out.println(daoParticipantImp.findAll());

        System.out.println("*****************");
        daoResponsableImp.findById(r.getId());

        DaoActivity daoActivity = new DaoActivity();
//        Activity a1=new Activity();
//        a1.setTitle("first activity");
//        a1.setStatus(Status.enCours);
//        a1.setDess("ssssssssssssssss");
//        a1.setType(Type.Evenement);
//        a1.setStartDate(LocalDate.of(2022,11,02));
//        a1.setEndDate(LocalDate.of(2022,11,05));
//        daoActivity.insert(a1);
        System.out.println(daoActivity.findAll().toString());
//        BDUtil.getEntityManager().createQuery("select user from User user",User.class).getResultList().stream().map(u->u.getName()).forEach(System.out::println)
//        BDUtil.closeDB();
//        ImpDaoUser impDaoUser = new ImpDaoUser();
//        User user = impDaoUser.login("saida@gmail.com","12345");
//        System.out.println(user.toString());


        //===============================

    }
}

