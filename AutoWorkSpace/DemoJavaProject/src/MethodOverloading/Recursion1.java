package MethodOverloading;
class BasicMaths1{
    int getFactorial(int num){
        if(num==1){
            return 1;
        }
        return num* getFactorial(num-1);
    }
}
public class Recursion1 {
    public static void main(String[] args) {
        BasicMaths1 b1=new BasicMaths1();
        int v1= b1.getFactorial(4);
        System.out.println(v1);
        int v2= b1.getFactorial(5);
        System.out.println(v2);
    }
}
