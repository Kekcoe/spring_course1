package hibernate_test.entity.hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class,2);

            session.createQuery("delete Employee where firstName = 'Alex'").executeUpdate();

//            session.delete(emp);

            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }

}
