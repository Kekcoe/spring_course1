package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();  Session session = factory.getCurrentSession()) {

//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Oleg","Razin","IT",160000);
//
//            Detail detail = new Detail("SPb","1234566","kekcoe@gmail.com");
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(emp);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Pavel","Ivanov","Sales",700);
//
//            Detail detail = new Detail("Moscow","1234566","pava@gmail.com");
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(emp);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 1);
            session.delete(emp);


            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }

}
