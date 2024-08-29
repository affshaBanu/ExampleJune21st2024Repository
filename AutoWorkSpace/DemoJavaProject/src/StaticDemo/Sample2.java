package StaticDemo;
class Sample3{

    Sample3(){
        System.out.println("Constructor");
    }
    {
        System.out.println("It is a first Instance Block!!!");
    }
    static
    {
        System.out.println("It is a static Block!!!");
    }
}
public class Sample2 {
    public static void main(String[] args) {
        Sample3 s1=new Sample3();
    }
}
