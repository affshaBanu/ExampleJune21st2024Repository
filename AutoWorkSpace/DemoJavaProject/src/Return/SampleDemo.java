package Return;
class Demo1{
    int[] gethalfofaElements(int arr[]){
        int b[]=new int[arr.length/2];
        int k=0;
        for (int i=0;i<arr.length/2;i++){
            b[k]=arr[i];
            k=k+1;
        }
        return  b;
    }
}
public class SampleDemo {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        int x[]={10,20,30,40,50,60};
        int z[]= d1.gethalfofaElements(x);
        for (int val:z){
            System.out.println(val);
        }
    }
}
