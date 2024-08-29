package Return;
class Prime1{
    boolean isPrime1(int num) {
        boolean Prime=true;
        for (int i=2;i<=num;i++){
            if (num%i==0){
                Prime=false;
                break;
            }
        }
        return Prime;
    }
    void showPrimeNumbers1to50(){
        //print prime  no in b/w 1-50
        for(int i=1;i<=50;i++){
            if (isPrime1(i)==true){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");

    }
    void showPrimeNumbers200to100(){

        //print prime no 200 to 100
        for (int i=200;i>=100;i--){
            if (isPrime1(i)==true){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }
    void showPrimeNumbers1to100(){
        //count of prime no in b/w 1-100
        int count=0;
        for (int i=1;i<=100;i++){
            if (isPrime1(i)==true){
                count=count+1;
            }
        }
        System.out.println("Prime numbers count:"+count);
    }


}
public class SampleProgram {
    public static void main(String[] args) {
        Prime1 p1 =new Prime1();
        p1.showPrimeNumbers1to50();
        p1.showPrimeNumbers200to100();
        p1.showPrimeNumbers1to100();
    }
}
