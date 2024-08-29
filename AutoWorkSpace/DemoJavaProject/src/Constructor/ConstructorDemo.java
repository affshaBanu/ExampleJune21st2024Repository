package Constructor;
class Customer{
    String firstName;
    String email;
    Customer(String firstName,String email){
       firstName=firstName;
        email=email;
        System.out.println("FirstName:"+firstName);
        System.out.println("EmailID:"+email);
    }
    void show(){
        System.out.println("FirstName:"+firstName);
        System.out.println("EmailID:"+email);
    }
}
public class ConstructorDemo {
    public static void main(String args[]){
        Customer c1=new Customer("Affi","affshabanu@gmail.com");
        c1.show();
    }
}
