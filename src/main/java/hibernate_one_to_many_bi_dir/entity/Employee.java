package hibernate_one_to_many_bi_dir.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "surname")
    private String surName;

    @Column(name = "salary")
    private Integer salary;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="department_id")
    private Deparment department;

    public Employee() {
    }

    public Employee(String firstName, String surName, Integer salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Deparment getDepartment() {
        return department;
    }

    public void setDepartment(Deparment deparment) {
        this.department = deparment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}