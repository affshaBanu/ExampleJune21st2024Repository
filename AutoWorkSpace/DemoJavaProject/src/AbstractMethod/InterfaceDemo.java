package AbstractMethod;
interface University{
    void showUniversityName(String name);
}

class SDMEngineering implements University{
   @Override
    public void showUniversityName(String name){
        System.out.println("The University Name:"+name);
    }
    void showCityName(String name){
        System.out.println("The City name:"+name);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        SDMEngineering s1=new SDMEngineering();
        s1.showCityName("Belguam");
        s1.showUniversityName("VTU Belguam");
    }
}
