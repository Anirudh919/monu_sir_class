import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1,nsp=n-1,midsp=-1;
        int row = 0,lrow=1;
        while (row<n){
            int i =0;
            while (i<nsp){
                System.out.print("  ");
                i++;
            }
            int j=0;
            int val = lrow;
            while (j<nst){
                System.out.print(val+" ");
                val--;
                j++;
            }
            int k=0;
            while (k<midsp){
                System.out.print("  ");
                k++;
            }
            int l=0;
            int rrow=1;
            if(row==0 || row==n-1){
                l=1;
            }
            while(l<nst){
                System.out.print(rrow+" ");
                rrow++;
                l++;
            }
            System.out.println();
            if(row<n/2){
                lrow++;
                midsp=midsp+2;
                nsp-=2;
                nst++;
            }else {
                lrow--;
                midsp=midsp-2;
                nsp+=2;
                nst--;
            }
            row++;
        }
    }
}
