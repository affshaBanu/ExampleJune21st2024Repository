package AbstractMethod;

abstract class Sample{

    abstract int getSumOfElements(int arr[]);{

    }
}
class Algebra extends Sample{
    int getSumOfElements(int arr[]){
        int sum=0;
        for (int kk:arr){
            sum=sum+kk;
        }
        return  sum;
    }
}
public class AbsrtactExample2 {
    public static void main(String[] args) {
        Algebra a1=new Algebra();
        int v1=a1.getSumOfElements(new int[]{2,4,6,8,10});
        System.out.println(v1);
    }
}
