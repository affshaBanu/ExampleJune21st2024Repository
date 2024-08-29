package InheritanceDemo;
class Maths1{
    void addition(int x,int y){
        System.out.println("Addition Result:"+(x+y));
    }
}
class Maths2 extends Maths1{
    void Substraction(int a,int b){
        System.out.println("Substraction Result:"+(a-b));
    }
}
public class Sample {
    public static void main(String[] args) {
        Maths2 m1=new Maths2();
        m1.Substraction(50,70);
        m1.addition(90,40);
    }
}
