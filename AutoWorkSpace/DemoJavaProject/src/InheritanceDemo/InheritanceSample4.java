package InheritanceDemo;
class CapitalCity{
    void showCityName(String name){
        System.out.println("Capital city Name:"+name);
    }
}
class MetroPoliyanCity extends CapitalCity{
    MetroPoliyanCity(String name){
        super.showCityName(name);
    }
    void showCityName(String name){
        System.out.println("MetroPolitan City Name:"+name);
    }
}
public class InheritanceSample4 {
    public static void main(String[] args) {
        MetroPoliyanCity m1=new MetroPoliyanCity("Chennai");
        m1.showCityName("Bangalore");
    }
}
