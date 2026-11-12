import java.lang.instrument.Instrumentation;
import java.util.Scanner;

public class pattern_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nos = n;
        int row =1;
        while(row<=(n*2)-1){
            int i=1;
            while (i<=nsp){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=nos){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            if(row<(n*2)/2){
                nsp--;
                nos--;
            }else {
                nsp++;
                nos++;
            }
            row++;
        }
    }
}
