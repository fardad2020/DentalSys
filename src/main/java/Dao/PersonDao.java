package Dao;

import Model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDao {

    public void addPersonDetails(Person person) {
        try {
            // 1. configuring hibernate
            Configuration configuration = new Configuration().configure();

            // 2. create sessionfactory
            SessionFactory sessionFactory = configuration.buildSessionFactory();

            // 3. Get Session object
            Session session = sessionFactory.openSession();

            // 4. Starting Transaction
            Transaction transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
            System.out.println("\n\n Details Added \n");
        }
        catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");
        }
    }
}
