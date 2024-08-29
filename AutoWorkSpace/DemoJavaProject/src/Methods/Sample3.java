package Methods;
    //4)write a method,for given 1d integer array perform,addition of sum of first half number and sum of second half numbers?
   class Addiition{
       void Aarray(){
           int sum=0;
           int a[]={10,20,30,40,50,60};
           for (int i=0;i<=2;i++){
               sum=sum+a[i];
           }
           System.out.println(sum+" ");
       }
       void Array1(){
           int sum=0;
           int a[]={1,2,3,4,5,6};
           for (int j=3;j<=5;j++){
               sum=sum+a[j];
           }
           System.out.println(sum+" ");
       }
   }
public class Sample3 {
    public static void main(String[] args) {
        Addiition a1 =new Addiition();
        a1.Aarray();
        a1.Array1();
    }
}
