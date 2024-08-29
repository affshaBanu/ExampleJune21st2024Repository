package com.sgtest.programs;

    class BasicMaths{
        BasicMaths(int x, int y, String scenario){
            int res=0;
            switch (scenario){
                case "add":
                    res=(x+y);
                    System.out.println("Addition:"+res);
                    break;

                case "Sub":
                    res=(x-y);
                    System.out.println("Subraction"+res);
                    break;

                case "Mult":
                    res=(x*y);
                    System.out.println("Multiplication:"+res);
                    break;

                case "Div":
                    res=(x+y);
                    System.out.println("Division:"+res);
                    break;

                default:
                    System.out.println("Invalid Scenario !!!");
            }
        }
    }
public class ConstructorDemo4 {
    public static void main(String args[]){
       BasicMaths b1=new BasicMaths(20,50,"add");
        BasicMaths b2=new BasicMaths(120,60,"Sub");
        BasicMaths b3=new BasicMaths(59,52,"Mult");
        BasicMaths b4=new BasicMaths(220,40,"Div");
    }
}
