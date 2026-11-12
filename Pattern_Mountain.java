import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1,nsp=n+1;
        int row=1,col=1,col1=1;
       while (row<=n){
           int i=0;
           int row_val=col;
           while (i<nst){
               System.out.print(row_val+"\t");
               row_val++;
               i++;
           }
           int j=0;
           while (j<nsp){
               System.out.print("  "+"\t");
               j++;
           }
           int k=0;
           int row_val1=col1;
           if(row==n){
               k=1;
               row_val1--;
           }
           while (k<nst){
               System.out.print(row_val1+"\t");
               row_val1--;
               k++;
           }
           System.out.println();
           nsp-=2;
           col1++;
           nst++;
           row++;
       }
    }
}
