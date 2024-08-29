package Methods;

    class Calculate2{
        void addition(int a,int b){
            int res=(a + b);
            System.out.println("Addition Result:"+res);
        }

        void Multiplication(int x, int y){
            int res=(x*y);
            System.out.println("Multiplication Reslut:"+res);
        }
    }
public class CalculateDemo2 {
    public static void main(String args[]){
        Calculate2 c1=new Calculate2();
        c1.addition(10,20);
        c1.Multiplication(10,15);
    }
}
