package Return;
class Demo3{
    static {
        System.out.println("It is First Staic Block!!!");
    }
    static {
        System.out.println("It is Second Static Block!!!");
    }
}
public class StaticDemo2 {
    public static void main(String[] args) {
        Demo3 d2=new Demo3();
    }
}
