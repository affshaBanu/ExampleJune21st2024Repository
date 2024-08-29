package Assignmen1st;
   //11)wam it has to display all 20 tables?
  class Table{
    void DisplayTable(){
        for (int i=1;i<=20;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+" * " +j+ " = " + i*j);
            }
            System.out.println();
        }
    }
   }
public class Method11Ques {
    public static void main(String[] args) {
        Table t1=new Table();
        t1.DisplayTable();
    }
}
