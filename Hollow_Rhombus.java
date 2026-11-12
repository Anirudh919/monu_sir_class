import java.util.Scanner;

public class Hollow_Rhombus {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int nst = n;
        int nsp = n-1;
        while(i<n){
            int k=0;
            while(k<nsp){
                System.out.print(" ");
                k++;
            }
            int j=0;
            while(j<nst){
                if(i==0 || i==n-1){
                    System.out.print("*");
                }else{
                    if(j==0 || j==nst-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                j++;
            }
            System.out.println();
            nsp--;
            i++;
        }
    }
}
