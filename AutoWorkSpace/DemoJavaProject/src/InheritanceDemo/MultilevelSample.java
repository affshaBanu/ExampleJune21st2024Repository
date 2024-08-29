package InheritanceDemo;
class Maths3{
    void addition(int x,int y){
        System.out.println("Addition Result:"+(x+y));
    }
}
class Maths4 extends Maths1{
    void Substraction(int a,int b){
        System.out.println("substraction Result:"+(a-b));
    }
}
class Maths5 extends Maths1{
    void Division(int x,int y){
        System.out.println("Division Result:"+(x/y));
    }

}
public class MultilevelSample {
    public static void main(String[] args) {
        Maths5 m1=new Maths5();
        m1.addition(10,40 );
      //  m1.substraction();
        m1.Division(20,40);
    }
}
