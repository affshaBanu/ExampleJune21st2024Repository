package Assignmen1st;
    //9)write a method to display count of each numbers tto display 1-100?

    class Number1{
        void DisplayNumber(){
            int count=0;
            for (int i=1;i<=100;i++){
                if (i%2==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
public class Method9Ques {
    public static void main(String[] args) {
        Number1 n1=new Number1();
        n1.DisplayNumber();
    }
}
