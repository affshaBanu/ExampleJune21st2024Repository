package Return;
class Sample{
    Sample(){
        System.out.println("It is Constructor!!!");
    }
    {
        System.out.println("It is a Instace Block!!!");
    }
}
public class InstanceBlock {
    public static void main(String[] args) {
        Sample s1=new Sample();
    }
}
