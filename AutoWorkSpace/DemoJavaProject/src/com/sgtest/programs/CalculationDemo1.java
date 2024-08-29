package com.sgtest.programs;

   class Maths1{
       Maths1(int num){
           int fact=1;
           for (int i=num;i>=1;i--){
               fact=fact*i;
           }
           System.out.println("Factorial of "+num+" is "+fact);
       }
   }
public class CalculationDemo1 {
    public static void main(String args[]){
        Maths1 m1=new Maths1(4);
        Maths1 m2=new Maths1(7);
        Maths1 m3=new Maths1(8);
        Maths1 m4=new Maths1(9);

    }
}
