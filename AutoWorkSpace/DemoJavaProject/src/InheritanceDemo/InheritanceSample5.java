package InheritanceDemo;

class Product{
    String cityName;
    void show(){
        System.out.println("City Name in super class:"+cityName);
    }
}
class Customer extends Product{
    String cityName;
    Customer(String name){
     super.cityName=name;
    }
    void Display(){
        System.out.println("City Name in Sub Class:"+cityName);
    }
}


public class InheritanceSample5 {
    public static void main(String[] args) {
        Customer c1=new Customer("Bangalore");
        c1.cityName="Chitradurga";
        c1.Display();
        c1.show();
    }
}
