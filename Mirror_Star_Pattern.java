import java.util.Scanner;

public class Mirror_Star_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n/2;
        int row = 0;
        while(row<n){
            int i=0;
            while(i<nsp){
                System.out.print("  ");
                i++;
            }
            int j=0;
            while (j<nst){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            if(row<n/2){
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
