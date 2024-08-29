package Assignmen1st;
    //4)Write a method  the method sholud display the count of even nummbers 1-500?
    class Number{
        void DisplayNumber(){
            int count=0;
            for (int i=1;i<=500;i++){
                if(i%2==0){
                    count++;

                }
            }
            System.out.println(count);
        }
    }

public class Method4 {
    public static void main(String[] args) {
        Number n1=new Number();
        n1.DisplayNumber();

    }
}
