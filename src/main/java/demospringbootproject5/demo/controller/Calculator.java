package demospringbootproject5.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/sum")
   public int sum(){
       int a=60;
       int b=50;
       int sum=a+b;
       System.out.println(" print sum is :" +sum);
       return  (a+b);
   }

   @RequestMapping("/subtraction")
   public int sub(){
        int a=40;
        int b=10;
        int sub=a-b;
        return sub;
   }

   @RequestMapping("/multiply")
   public int multiply(){
        int a=10;
        int b=20;
        int mul =a*b;
        return mul;
   }

   @RequestMapping("/division")
   public double divide(){
        double a=72;
        double b=5;
        double div =a/b;
        return div;
   }

}
