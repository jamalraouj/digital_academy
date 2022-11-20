package Dao.Implementation;

import Entity.Activity;

import java.util.List;

import Util.BDUtil;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoActivityTest {

    /**
     * Method under test: {@link DaoActivity#delete(Activity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R006 Static initializer failed.
        //   The static initializer of
        //   Util.BDUtil
        //   threw org.hibernate.service.spi.ServiceException while trying to load it.
        //   Make sure the static initializer of BDUtil
        //   can be executed without throwing exceptions.
        //   Exception: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
        //       at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:267)
        //       at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:230)
        //       at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:207)
        //       at org.hibernate.boot.model.relational.Database.<init>(Database.java:44)
        //       at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:216)
        //       at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:189)
        //       at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:137)
        //       at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1350)
        //       at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1421)
        //       at org.hibernate.jpa.HibernatePersistenceProvider.createEntityManagerFactory(HibernatePersistenceProvider.java:55)
        //       at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:80)
        //       at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:55)
        //       at Util.BDUtil.<clinit>(BDUtil.java:8)
        //       at Dao.Implementation.DaoActivity.delete(DaoActivity.java:15)

        // Arrange
        // TODO: Populate arranged inputs
        DaoActivity daoActivity = null;
        Activity o = null;

        // Act
        boolean actualDeleteResult = daoActivity.delete(o);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DaoActivity#findById(long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindById() {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DaoActivity daoActivity = null;
        long id = 0L;

        // Act
        Activity actualFindByIdResult = daoActivity.findById(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DaoActivity#findAll()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAll() {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DaoActivity daoActivity = null;

        // Act
        List<Activity> actualFindAllResult = daoActivity.findAll();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DaoActivity#insert(Activity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInsert() {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DaoActivity daoActivity = null;
        Activity o = null;

        // Act
        daoActivity.insert(o);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DaoActivity#update(Activity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate() {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DaoActivity daoActivity = null;
        Activity o = null;

        // Act
        boolean actualUpdateResult = daoActivity.update(o);

        // Assert
        // TODO: Add assertions on result
    }

    @Test
    void delete() {

    }

//     @Override
//    public Activity findById(long id) {
//        Activity a;
//
//        a=BDUtil.getEntityManager().find(Activity.class,id);
//        return a;
//    }
    @Test
    void findById() {
        Activity one;
        for(int i = 2;i<10;i++) {
            one = BDUtil.getEntityManager().find(Activity.class, i);
            System.out.println(one);
            assertNotNull(one);
        }
    }

    @Test
    void findAll() {
    }

    @Test
    void insert() {

    }

    @Test
    void update() {
    }

}