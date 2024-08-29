package com.sgtest.programs;

   class Maths2{
       Maths2(int arr[]){
           for (int i= arr.length-1;i>= arr.length/2;i--){
               System.out.println(arr[i]);
           }
       }
   }
public class CalculationDemo2 {
    public static void main(String args[]){
        int b[]={10,20,30,40,50,60};
        Maths2 m1=new Maths2(b);

        Maths2 m2=new Maths2(new int[] {2,4,6,8,10,12});
    }
}
