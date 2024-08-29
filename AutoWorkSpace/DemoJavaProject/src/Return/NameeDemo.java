package Return;
class DisplayName{
    String getName(String Name){
        return Name;
    }
}
public class NameeDemo {
    public static void main(String[] args) {
        DisplayName d1=new DisplayName();
        String v1= d1.getName("Affsha");
        System.out.println(v1);
    }
}
