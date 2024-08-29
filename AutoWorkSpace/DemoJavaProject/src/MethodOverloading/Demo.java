package MethodOverloading;

class Maths1{
    void addition(int x,int y){
        System.out.println("Addition Result:"+(x + y));
    }
    void addition(int x,int y,int z){
        System.out.println("Addition Result:"+(x + y + z));
    }
    void addition(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Addition Result:"+sum);
    }
}
public class Demo {
    public static void main(String[] args) {
        Maths1 m1=new Maths1();
        m1.addition(10,20);
        m1.addition(20,50,60);
        m1.addition(new int[] {2,3,4,5,6,7,8,9});
    }
}
