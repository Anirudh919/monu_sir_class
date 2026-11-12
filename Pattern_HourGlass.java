import java.util.Scanner;

public class Pattern_HourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nst=(n*2)+1,nsp=0;
        int row = 0,col_val=n;
        while(row<(n*2)+1){
            int i=0;
            while (i<nsp){
                System.out.print("  ");
                i++;
            }
            int j=0;
            int row_val = col_val;
            while(j<nst){
                System.out.print(row_val+" ");
                if(j<nst/2){
                    row_val--;
                }else {
                    row_val++;
                }
                j++;
            }
            System.out.println();
            if(row<n){
                nst-=2;
                nsp++;
                col_val--;
            }else {
                nst+=2;
                nsp--;
                col_val++;
            }
            row++;
        }
    }
}
