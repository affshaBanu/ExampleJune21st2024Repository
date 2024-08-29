package AbstractMethod;

abstract class College{
    abstract void showCollegeName(String name);
    abstract void showCityName(String name);
    void showCourses(String courses[]){
        System.out.println("Courses :");
        for (int i=0;i<courses.length;i++){
            System.out.println("Courses Name:"+courses[i]);
        }
    }
}
class Engineering extends College {
    void showCollegeName(String name) {
        System.out.println("Engineering College Name:" + name);
    }

    void showCityName(String name) {
        System.out.println("City Name :" + name);
    }


    void DisplayAddress(String address)
    {
        System.out.println("Address of the College:"+address);
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Engineering c1=new Engineering();
        c1.showCollegeName("HMS College");
        c1.showCityName("Bangalore");
        String s[]={"Civil","Mech","Cse","EEE"};
        c1.showCourses(s);
        c1.DisplayAddress("1st Main 10th cross,5th phase,serivce Road");
    }
}
