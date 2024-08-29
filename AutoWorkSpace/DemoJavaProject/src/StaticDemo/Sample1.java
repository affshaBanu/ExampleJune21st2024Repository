package StaticDemo;
/*class Sample{
    {
        System.out.println("It is a first Instance Block!!!");
    }
    {
        System.out.println("It is a second Instance Block!!!");
    }
}*/
class Sample{
    byte[] array(){
        byte a[]={10,20,30,40};
        return a;

    }

}


public class Sample1 {
    public static void main(String[] args) {
        Sample s1=new Sample();
        for (byte i : s1.array()) {
            System.out.print(i + " ");
        }
    }
}
