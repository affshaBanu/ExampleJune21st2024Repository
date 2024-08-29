package Constructor;
class Person{
    String firstName;
    int age;
    Person(String fn,int Age){
        firstName=fn;
        age=Age;
        System.out.println("FirstName:"+firstName);
        System.out.println("Age:"+age);
    }
}
public class PersonDemo {
    public static void main(String args[]){
       Person p1=new Person("Affi",22);

    }
}
