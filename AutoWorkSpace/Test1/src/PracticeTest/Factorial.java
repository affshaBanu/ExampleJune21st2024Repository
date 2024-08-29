package PracticeTest;
class Factorial1{

   int  getName(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
public class Factorial {
    public static void main(String[] args) {
        Factorial1 f1=new Factorial1();
        int v1=f1.getName(4);
        System.out.println(v1);



    }
}
