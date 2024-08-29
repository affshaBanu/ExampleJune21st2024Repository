package Return;
  class Prime{
      boolean isPrime(int num) {
       boolean Prime=true;
       for (int i=2;i<=num;i++){
           if (num%i==0){
               Prime=false;
               break;
           }
       }
       return Prime;
      }
  }
public class ReturnDemo {
    public static void main(String[] args) {
        Prime p1 =new Prime();
        boolean val1=p1.isPrime(27);
        System.out.println(val1);
        System.out.println("---------------------------------");

        //print prime  no in b/w 1-50
        for (int i=1;i<=50;i++){
            if (p1.isPrime(i)==true){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");

        //print prime no 200 to 100
        for (int i=200;i>=100;i--){
            if (p1.isPrime(i)==true){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------");
        //count of prime no in b/w 1-100
        int count=0;
        for (int i=1;i<=100;i++){
            if (p1.isPrime(i)==true){
                count=count+1;
            }
        }
        System.out.println("Prime numbers count:"+count);
    }
}
