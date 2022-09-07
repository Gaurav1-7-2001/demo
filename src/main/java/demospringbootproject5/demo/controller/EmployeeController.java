package demospringbootproject5.demo.controller;


import demospringbootproject5.demo.Model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public Employee getEmployee(){

        Employee emp =new Employee("sam", 100, "it", 900002.123);
        return emp;

    }
@RequestMapping("/arrayListEmployee")
    public ArrayList<Employee> EmployeeArrayList() {
    ArrayList<Employee> emp = new ArrayList<>();
    Employee emp1 = new Employee("gau", 101, "me", 6451623.216);
    Employee emp2 = new Employee("ram", 102, "cs", 67425.21);

    //add emp
    emp.add(emp1);
    emp.add(emp2);




    return emp;

}

}
