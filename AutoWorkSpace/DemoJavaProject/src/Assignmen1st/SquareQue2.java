package Assignmen1st;
      //2)Write a method the method as to display sum of square of each number b/w1-10?
       class SquareSample{
           void Square(){
               int num,b;
               int sum=0;
               for (int i=1;i<=10;i++){
                   b=i*i;
                   sum=sum+b;

               }
               System.out.println(sum);
           }
      }
public class SquareQue2 {
    public static void main(String[] args) {
        SquareSample s1=new SquareSample();
        s1.Square();
    }
}
