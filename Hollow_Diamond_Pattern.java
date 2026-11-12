import java.util.Scanner;

public class Hollow_Diamond_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = (n+1)/2;
        int nsp = -1;
        int row = 1;
        while (row<=n){
            int i=0;
            while(i<nst){
                System.out.print("*"+"\t");
                i++;
            }
            int j=0;
            while (j<nsp){
                System.out.print(" "+"\t");
                j++;
            }
            int k=0;
            if(row == 1 || row == n){
                k=1;
            }
            while(k<nst){
                System.out.print("*"+"\t");
                k++;
            }
            System.out.println();
            if(row<(n+1)/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
            row++;
        }
    }
}
