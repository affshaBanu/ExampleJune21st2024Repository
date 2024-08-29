package InheritanceDemo;
class Maths{
    void addition(int x,int y){
        System.out.println("Addition Result:"+(x+y));
    }
}
class Maths6  extends Maths{
    void Substraction(int a,int b){
        System.out.println("Substraction Result:"+(a-b));
    }
}
class Maths7  extends Maths{
    void Division(int a,int b){
        System.out.println("Division Result:"+(a-b));
    }
}
public class Sample2 {
    public static void main(String[] args) {
        Maths6 m1=new Maths6();
        m1.addition(35,20);
        m1.Substraction(35,6);

        Maths7 m2=new Maths7();
        m2.Division(40,5);
        m2.addition(500,250);
    }
}
