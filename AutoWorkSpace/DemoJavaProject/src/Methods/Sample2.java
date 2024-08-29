package Methods;

    class SampleDemo{
         void SampleDemo(){
            int a[]={1,2,3,4,5};
            for (int i=0;i<a.length;i++){
               if((i == 0) || (i==a.length-1)){
                   System.out.println(a[i]);
               }
            }
        }
    }
public class Sample2 {
    public static void main(String[] args) {
        SampleDemo s1=new SampleDemo();
        s1.SampleDemo();
    }
}
