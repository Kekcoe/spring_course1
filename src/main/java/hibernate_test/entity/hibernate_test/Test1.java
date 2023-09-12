package hibernate_test.entity.hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Alex", "Petrov", "IT", 130000);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }

}
