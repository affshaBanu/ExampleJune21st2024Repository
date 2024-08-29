package com.sgtest.programs;

import javax.xml.transform.stream.StreamSource;
import java.util.Collections;

public class Person {
    String firstName;
    int age;

    public static void main(String args[]) {

        Person obj1=new Person();
        obj1.firstName="Affi";
        obj1.age=21;
        System.out.println("First name:"+obj1.firstName);
        System.out.println("Age is:"+obj1.age);
System.out.println("-------------------------------");

Person obj2=new Person();
obj2.firstName="Sam";
obj2.age=25;
System.out.println("First Name:"+obj2.firstName);
System.out.println("Age is:"+obj2.age);
    }
}
