import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = -1,nst=n;
        int row = 1;
        while(row<=(n*2)-1){
            int i=0;
            while (i<nst){
                System.out.print("*");
                i++;
            }
            int j=0;
            while (j<nsp){
                System.out.print(" ");
                j++;
            }
            int k=0;
            if(row==1 || row==(n*2)-1){
                k=1;
            }
            while(k<nst){
                System.out.print("*");
                k++;
            }
            System.out.println();
            if(row<n){
                nsp+=2;
                nst--;
            }else {
                nsp-=2;
                nst++;
            }
            row++;
        }
    }
}
