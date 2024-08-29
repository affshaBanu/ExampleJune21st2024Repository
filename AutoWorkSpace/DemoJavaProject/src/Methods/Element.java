package Methods;

   class Array{
       void Sum(int a[]){
           int sum=0;
           for (int i=4;i<a.length;i++){

                   sum=sum+a[i];
               }
           System.out.println(sum+" ");
           }


       }

public class Element {
    public static void main(String args[]){

      Array a1=new Array();
         int a[]={1,2,3,4,5,6,7,8};
        a1.Sum(a);
    }
}
