package hibernate_one_to_many_uni;


import hibernate_one_to_many_bi_dir.entity.Deparment;
import hibernate_one_to_many_bi_dir.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Deparment.class)
                .buildSessionFactory();  Session session = factory.getCurrentSession()) {

            Deparment dep =new Deparment("IT",1000,700);

            Employee emp1 = new Employee("Oleg","Razin",1000);
            Employee emp2 = new Employee("Elena","Smirnova",800);

            dep.addEmployeeToDeparment(emp1);
            dep.addEmployeeToDeparment(emp2);


            session.beginTransaction();

                session.persist(dep);

            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }

}
