import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1,nsp=n-1,row=1;
        while (row<=(n*2)-1){
            int i=0;
            while(i<nsp){
                System.out.print(" "+"\t");
                i++;
            }
            int j=1;
            int val = (row<=n) ? row : (2*n)-row ;
            while (j<=nst){
                System.out.print(val+"\t");
                if(j<=nst/2){
                    val++;
                }else {
                    val--;
                }
                j++;
            }
            System.out.println();
            if(row<n){
                nsp--;
                nst+=2;
            }else {
                nsp++;
                nst-=2;
            }
            row++;
        }

    }
}
