package demospringbootproject5.demo.controller;

import demospringbootproject5.demo.Model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

    @RequestMapping("/welcome")
    public String welcome(){
        String message =" this is application of spring boot";
        return message;
    }



    @RequestMapping("/course")
    public ArrayList<String> getcourse(){

        ArrayList<String> course =new ArrayList<>();
        course.add("java");
        course.add("spring");
        course.add("spring boot");
        course.add("microservices ");
        course.add("cloud");


    return course;

    }

    @RequestMapping("/student")
    public Student getStudent(){

        Student std =new Student("Gaurav ",23,"cs");
        return std;
    }


    @RequestMapping("/ArrayListStudent")
    public ArrayList<Student> createStudentArrayList(){

        ArrayList<Student> student= new ArrayList<>();

        Student std=new Student("guarav",22, "it");
        Student std1= new Student("samyak", 23, "me");
        Student std2 =new Student("rohit", 23,"ce");

        //add Student object in Arraylist

        student.add(std);
        student.add(std1);
        student.add(std2);

        return student;


    }


    @RequestMapping("/getFirstData")
    public Student getFirstData(){

        ArrayList<Student> student= new ArrayList<>();

        Student std=new Student("guarav",22, "it");
        Student std1= new Student("samyak", 23, "me");
        Student std2 =new Student("rohit", 23,"ce");

        //add Student object in Arraylist

        student.add(std);
        student.add(std1);
        student.add(std2);

        return student.get(1);

    }


}
