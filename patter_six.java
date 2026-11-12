import java.util.Scanner;

public class patter_six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=n,nsp=0,row=0;
        while(row<n){
            int i=0;
            while (i<nsp){
                System.out.print("  ");
                i++;
            }
            int j=0;
            while (j<nst){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            nsp=nsp+2;
            nst--;
            row++;
        }
    }
}
