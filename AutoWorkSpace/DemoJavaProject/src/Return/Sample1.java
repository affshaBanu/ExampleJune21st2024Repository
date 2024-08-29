package Return;
class DishName{
    String[] getDishName(){
        String s[]={"Idliy","poori","Dosa"};
        return s;
    }
}
public class Sample1 {
    public static void main(String[] args) {
        DishName d1 =new DishName();
        String dishes[]= d1.getDishName();
        for (String val:dishes){
            System.out.println(val);
        }
    }
}
