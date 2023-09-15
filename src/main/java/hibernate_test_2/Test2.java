package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();  Session session = factory.getCurrentSession()) {


//            Employee emp = new Employee("Nikolay","Sidor","HR",700);
//            Detail detail = new Detail("NY","723444566","nik@gmail.com");
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);
//
//            session.beginTransaction();
//
//            session.save(detail);

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 4L);
            System.out.println(detail.getEmployee());
            session.delete(detail);
            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }

}
