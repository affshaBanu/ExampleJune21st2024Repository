package Assignmen1st;
      //10)write a method to display sum of prime numbers in b/w 200-100?
     class Sample1{
         void PrimeNumber(){
             int sum=0;
             for (int i=200;i>=100;i--){
                 if(i%2==0){
                     sum++;
                 }
             }
             System.out.println(sum);
         }
     }
public class Method10Ques {
    public static void main(String[] args) {
        Sample1 s1=new Sample1();
        s1.PrimeNumber();
    }
}
