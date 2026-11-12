import java.util.Scanner;

public class Pattern_InvertedHourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1,nsp=n;
        int row = 0;
        int col_val=n,col_val2=n;
        while (row<(n*2)+1){
            int i =0;
            int row_val=col_val;
            while (i<nst){
                System.out.print(row_val+" ");
                row_val--;
                i++;
            }
            int j =0;
            while (j<(nsp*2)-1){
                System.out.print(" "+" ");
                j++;
            }
            int k=0;
            int row_val2 = col_val2;
            if(row==n){
                k=1;
                row_val2++;
            }
            while (k<nst){
                System.out.print(row_val2+" ");
                row_val2++;
                k++;
            }
            System.out.println();
            if(row<n){
                nst++;
                nsp--;
                col_val2--;
            }else {
                col_val2++;
                nst--;
                nsp++;
            }
            row++;
        }

    }
}
