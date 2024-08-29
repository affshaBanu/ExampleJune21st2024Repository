package Methods;

   class Sample{
       void Factorial(int num){
           int fact=1   ;

           for (int i=1;i<=num;i++){

               fact=fact*i;

           }
           System.out.println("Factorial number:"+fact);

       }

   }
public class Sample1 {
    public static void main(String args[]){
        Sample s1=new Sample();
        s1.Factorial(3);
        s1.Factorial(4);

    }
}
