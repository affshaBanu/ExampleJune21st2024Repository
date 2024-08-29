package Methods;
class  Calculate1{
    int add(int x,int y){
        int res=(x+y);
        return res;
    }
    int sub(int a, int b){
        return (a-b);
    }
    void Multiplication(int x, int y){
        int res=(x * y);
        System.out.println("Multiplication Result:"+res);
    }
}
public class CalaculationDemo {
    public static void main(String[] args) {
        Calculate1 c1=new Calculate1();
        //first apporach
        int v1= c1.add(10,2);
        int v2= c1.sub(25 ,15);
        c1.Multiplication(v1,v2);

        //second approach
        c1.Multiplication(c1.add(5,10), c1.sub(100,90));
    }
}
