package SgTesting;

public class PatternCharcter {
    public static void main(String args[]){
        char ch='A';
        for (int i=1;i<=6;i++) {

            for (int j=6;j>=i;j--){
                System.out.print(ch+" ");


            }
            System.out.println();
        }
    }
}
