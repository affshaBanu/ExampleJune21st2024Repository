package Assignmen1st;
     //1)Write a method to displayed the characters from p to z?
   class CharacterDemo{
       void Sample(){
           //char ch;
           for (char i='P';i<='Z';i++){
               System.out.println(i);
           }
       }
     }
public class Character {
    public static void main(String[] args) {
         CharacterDemo c1=new CharacterDemo();
         c1.Sample();
    }
}
