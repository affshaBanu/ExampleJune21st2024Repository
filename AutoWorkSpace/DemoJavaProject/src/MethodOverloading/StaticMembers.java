package MethodOverloading;

public class StaticMembers {
    String firstName;
    int age;
    public static void main(String[] args) {
        StaticMembers s1=new StaticMembers();
        s1.firstName="Affsha";
        s1.age=22;
        System.out.println("FirstName:"+s1.firstName);
        System.out.println("Age:"+s1.age);
        System.out.println("-------------------------");
    }
}
