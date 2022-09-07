package demospringbootproject5.demo.Model;

public class Employee {

    String name;
    int id;
    String dept;
    double Salary;

    //parameterized constructor
    public Employee(String name, int id, String dept, double salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
       this.Salary = salary;
    }

    //getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }
}
