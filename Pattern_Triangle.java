import java.util.Scanner;

public class Pattern_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nst = 1,nsp=n-1;
        int row=0;

        while (row<n){
            int i=0;
            while (i<nsp){
                System.out.print(" "+"\t");
                i++;
            }
            int j=0;
            int val=row+1;
            while (j<nst){
                System.out.print(val+"\t");
                if(j<nst/2){
                    val++;
                }else {
                    val--;
                }
                j++;
            }
            System.out.println();
            nsp--;
            nst+=2;
            row++;
        }

    }
}
