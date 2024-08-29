package Assignmen1st;
      //3)for the given 2d double array display first row of the elements in reverse order?
class Double{
    void Demo(){
        double a[][]={{10.28,20.20,30.39},{40.21,50.34,60.56}};
      //  for (int i=a.length-1;i>=0;i--){
            for (int j=a[0].length-1;j>=0;j--){
               // if(i==0){
                    System.out.print(a[1][j]+" ");
               // }
              //  System.out.println();
            }

      //  }
    }
}
public class Method3 {
    public static void main(String[] args) {
        Double d1=new Double();
        d1.Demo();

    }
}
