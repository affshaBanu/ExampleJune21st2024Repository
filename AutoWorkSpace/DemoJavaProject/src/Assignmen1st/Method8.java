package Assignmen1st;
    //8)wap to display prime numbers b/w 1-50?
    class Prime{
      void PrimeNumber(){
          int count=0;
          for (int n=1;n<=50;n++){

              for (int i=1;i<=n;i++){
                    if (n%i==0){
                       count++;

                    }
                  if (count==2){
                      System.out.println("It is a prime number"+n);
                    }

              }
          }
      }


        }


public class Method8 {
    public static void main(String[] args) {
           Prime p1=new Prime();
           p1.PrimeNumber();


    }
}
