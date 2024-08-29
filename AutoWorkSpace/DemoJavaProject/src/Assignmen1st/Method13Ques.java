package Assignmen1st;
  //13)wam to display count of numbers in b/w 200-400 which has divisible for 2,4,6?
    class CountNumbers{
        void DisplayCountNumber(){
            int count=0;
            for (int i=200;i<=400;i++){
                if (i%2==0){
                    count++;
                }

            }
            System.out.println(count);
        }
      void DisplayCountNumber1(){
          int count=0;
          for (int i=200;i<=400;i++){
              if (i%4==0){
                  count++;
              }

          }
          System.out.println(count);
      }
      void DisplayCountNumber2(){
          int count=0;
          for (int i=200;i<=400;i++){
              if (i%6==0){
                  count++;
              }

          }
          System.out.println(count);
      }

  }
public class Method13Ques {
    public static void main(String[] args) {
        CountNumbers c1=new CountNumbers();
        c1.DisplayCountNumber();
        c1.DisplayCountNumber1();
        c1.DisplayCountNumber2();
    }
}
