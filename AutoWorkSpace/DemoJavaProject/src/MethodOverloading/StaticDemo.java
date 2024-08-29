package MethodOverloading;
class Maths3{
    static String mathsType;
    static void addition(int x,int y){
        int res=(x + y);
        System.out.println("Addition Result:"+res);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Maths3.mathsType="Algebra";
        System.out.println("Maths Type:"+Maths3.mathsType);

        Maths3.addition(100,50);
    }
}
