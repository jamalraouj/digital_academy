import Dao.Implementation.DaoParticipantImp;
import Dao.Implementation.DaoResponsableImp;
import Dao.Implementation.DaoUserImp;
import Entity.Participant;
import Entity.Responsable;
import Entity.User;
import Util.BDUtil;

import static Entity.TypeResponsable.Formateur;

public class Main {
    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("digital_academy");
//        System.out.println("entityManager open "+entityManagerFactory.isOpen());
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        BDUtil.openDB();
//        Participant p=new Participant();
//        p.setName("abdesselam");
//        p.setEmail("abdesslam@gmail.com");
//        p.setPhone("929438984");
//        p.setPassword("1234");
//        p.setStatus(true);
//        p.setDomaine("shdsjds");
//        p.setStructure("ertyui");
//        BDUtil.getEntityManager().persist(p);
////        Student s2=new Student();
////        s2.setName("jamal");
////        s2.setClasse("java");
////        entityManager.persist(s2);
//        System.out.println("name "+BDUtil.getEntityManager().find(User.class,1).getName());
//        System.out.println("done");
//        BDUtil.closeDB();
//        BDUtil.openDB();
//        BDUtil.getEntityManager().createQuery("select user from User user",User.class).getResultList().stream().map(u->u.getName()).forEach(System.out::println);
//        // BDUtil.closeDB();
//        DaoUserImp impDaoUser = new DaoUserImp();
//        User user = impDaoUser.login("abdesslam@gmail.com","1234");
//        System.out.println(user.toString());


//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("digital_academy");
//        System.out.println(entityManagerFactory.isOpen());
//        System.exit(0);
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //===============================

        DaoResponsableImp daoResponsableImp=new DaoResponsableImp();
        Responsable r=new Responsable();
        r.setName("saida");
        r.setEmail("saida@gmail.com");
        r.setPhone("6786876987");
        r.setPassword("12345");
        r.setDomaine("info");


        r.setTypeResp(Formateur);
        BDUtil.getEntityManager().persist(r);




        Responsable r1=new Responsable();
        r1.setName("jamal");
        r1.setEmail("jamal@gmail.com");
        r1.setPhone("6786876987");
        r1.setPassword("123456");
        r1.setDomaine("info");
        r1.setTypeResp(Formateur);
        BDUtil.getEntityManager().persist(r1);

        Responsable r2=new Responsable();
        r2.setName("raouia");
        r2.setEmail("raouia@gmail.com");
        r2.setPhone("6786876987");
        r2.setPassword("123456");
        r2.setDomaine("info");
        r2.setTypeResp(Formateur);

        Responsable p=new Responsable();
        p.setId(1);
        p.setName("ahmed");
        p.setPhone("7767868");
        p.setPassword("123");
        p.setEmail("ahmed@gmail.com");

        System.out.println("name "+BDUtil.getEntityManager().find(User.class,1).getName());

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
        r4.setEmail("khadija@gmail.com");
        r4.setPhone("6786876987");
        r4.setPassword("12345");
        daoParticipantImp.insert(r4);
//        ==================


        Participant r3=new Participant();
        r3.setName("saidaAAAA");
        r3.setEmail("saidaAAAA@gmail.com");
        r3.setPhone("6786876987");
        r3.setPassword("12345");
        BDUtil.getEntityManager().persist(r3);
        System.out.println(daoParticipantImp.findAll());

        System.out.println("*****************");
        daoResponsableImp.activeUser(r);
        daoResponsableImp.findById(r.getId());


//        BDUtil.getEntityManager().createQuery("select user from User user",User.class).getResultList().stream().map(u->u.getName()).forEach(System.out::println)
//        BDUtil.closeDB();
//        ImpDaoUser impDaoUser = new ImpDaoUser();
//        User user = impDaoUser.login("saida@gmail.com","12345");
//        System.out.println(user.toString());

        //===============================

    }
}

