package MethodOverloading;
class BasicMaths{
    int num=10;
    void displayNumbers(){
        if (num<=20){
            System.out.println(num);
            num=num+1;
            displayNumbers();
        }
    }
}
public class RecursionDemo1 {
    public static void main(String[] args) {
        BasicMaths m1=new BasicMaths();
        m1.displayNumbers();
    }
}
