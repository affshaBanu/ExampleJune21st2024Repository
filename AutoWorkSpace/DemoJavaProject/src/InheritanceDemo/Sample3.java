package InheritanceDemo;
class Demo{
    void addition(int x,int y){
        System.out.println("Addition Result:"+(x+y));
    }
}
class Demo1  extends Demo {
    void Substraction(int a, int b) {
        System.out.println("Substraction Result:" + (a - b));
    }
}
class Demo2  extends Demo {
    void Substraction(int a, int b) {
        System.out.println("Division Result:" + (a / b));
    }
}
class Demo3  extends Demo2 {
    void Multiplication (int x, int y) {
        System.out.println("Substraction Result:" + (x*y));
    }
}

    public class Sample3 {
    public static void main(String[] args) {
        Demo1 m1=new Demo1();
        m1.Substraction(20,50);
        m1.addition(20,30);

        Demo3 m2=new Demo3();
        m2.Multiplication(50,70);
       // m2.Division(40,50);
        m2.addition(500,5000);
    }
}
