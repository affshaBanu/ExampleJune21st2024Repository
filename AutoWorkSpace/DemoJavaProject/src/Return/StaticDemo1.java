package Return;
class Demo2{
    Demo2(){
        System.out.println("It is a constructor!!!");
    }
    static {
        System.out.println("It is static block!!!");
    }
}
public class StaticDemo1 {
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
    }
}
