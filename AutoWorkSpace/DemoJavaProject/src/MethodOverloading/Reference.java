package MethodOverloading;
class CallByReference{
    int x,y;
   void Calculate(CallByReference o){
       o.x+=100;
       o.y*=9;
       System.out.println("In the Method value of x:"+o.x);
       System.out.println("In the Method value of y:"+o.y);
   }
}
public class Reference {
    public static void main(String[] args) {
        CallByReference o=new CallByReference();
        o.x=10;
        o.y=5;
        o.Calculate(o);
        System.out.println("After Method Execution value of x:"+o.x);
        System.out.println("After Method Execution value of y:"+o.y);
    }
}
