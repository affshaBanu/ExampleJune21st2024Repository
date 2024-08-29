package InheritanceDemo;

import javax.print.attribute.standard.JobName;

class Employee{
    String firstname;
    String jobName;
    Employee(String fn,String jobName){
        firstname=fn;
        this.jobName= jobName;
        System.out.println("FirstName:"+firstname);
        System.out.println("JobName:"+jobName);
    }
}
class Department extends Employee{
    Department(String first,String job){
        super(first,job);
    }
}

public class InheritanceSample2 {
    public static void main(String[] args) {
        Department d1=new Department("Affi","Manager");
        Department d2=new Department("Sam","Senoir Manager");
        Department d3=new Department("Adams","Analyst");
    }
}
