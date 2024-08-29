package MethodOverloading;
class CallByValue{
    void Calculate(int x,int y){
        x+=100;
        y*=9;
        System.out.println("In Method value of x:"+x);
        System.out.println("In Method value of y:"+y);
    }
}
public class CallByValueDemo {
    public static void main(String[] args) {
        int x,y;
    x=10; y=5;
        System.out.println("value of x:"+x);
        System.out.println("value of x:"+y);
        CallByValue c1=new CallByValue();
        c1.Calculate(x,y);
        System.out.println("After Method Execution value of x:"+x);
        System.out.println("After Method Execution value of x:"+y);
    }
}
