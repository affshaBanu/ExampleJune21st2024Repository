package AbstractMethod;
interface University1{
    void showUniversityName(String name);
}
interface College1{
    abstract void showCollegeName(String name);
}
class SDMEngineering1 implements University1,College1{
    @Override
    public void showUniversityName(String name){
        System.out.println("The University Name:"+name);
    }
    @Override
    public void showCollegeName(String name){
        System.out.println("The Engineering College Name:"+name);
    }
    void showCityName(String name){
        System.out.println("The City name:"+name);
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        SDMEngineering1 s1=new SDMEngineering1();
        s1.showCityName("Belguam");
        s1.showUniversityName("VTU Belguam");
        s1.showCollegeName("SDM Engineering1 College");
    }
}
