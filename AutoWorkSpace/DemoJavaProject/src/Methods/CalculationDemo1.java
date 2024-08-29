package Methods;

   class Calculation{
       void addition(){
           int x,y,res;
           x=20;y=50;
           res=(x+y);
           System.out.println("Addition Result:"+res);
       }

       void  Multiplication(){
           int res,x,y;
           x=12;y=10;
           res=(x * y);
           System.out.println("Multiplication Result:"+res);
       }
   }
public class CalculationDemo1 {
    public static void main(String args[]){
        Calculation c1 =new Calculation();
        c1.addition();
        c1.Multiplication();
    }
}
