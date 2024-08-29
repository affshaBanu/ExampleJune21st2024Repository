package SgTesting;

public class FibonacciNumber {
    public static void main(String args[]){
        int  sn,num=10;
        int sum=0;
        int fn=0; sn=1;
        for (int i=2;i<=10;i++){
            int tn=fn+sn;
            sum=sum+tn;
            fn=sn;
            sn=tn;
        }
        System.out.println("Sum:"+sum);
    }
}
