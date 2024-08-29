package PracticeTest;
class Price{
    int getName(int price){
        return price;
    }
}
public class Sample {
    public static void main(String[] args) {
        Price p1=new Price();
       int v1=p1.getName(2000);
        System.out.println("Samsung mobile phone is");
        System.out.println(v1);
    }
}

