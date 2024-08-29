package Return;
class Calculate2{
    int add1(int x,int y){
        int res=(x+y);
        return res;
    }
    int sub1(int a,int b){
        return (a-b);
    }
    void Multiplication(){
        int p=this.add1(5,15);
        int q=this.sub1(12,7);
        int res=(p * q);
        System.out.println("Multiplication Result:"+res);
    }
}
public class CalculationDemo2 {
    public static void main(String[] args) {
        Calculate2 c1=new Calculate2();
        c1.Multiplication();

    }
}
