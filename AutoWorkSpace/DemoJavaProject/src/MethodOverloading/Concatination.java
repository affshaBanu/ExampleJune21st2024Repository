package MethodOverloading;
class Demo1{
    static String getConcatinationResult(String str[][]){
        String s=" ";
        for (int i=0;i<str.length;i++){
            for (int j=0;j<str[i].length;j++){
                s=s+str[i][j]+" ";
            }
        }
        return s;
    }
}
public class Concatination {
    public static void main(String[] args) {
        String val=Demo1.getConcatinationResult(new String[][]{{"qq","ww"},{"aa","bb"}});
        System.out.println(val);

    }
}
