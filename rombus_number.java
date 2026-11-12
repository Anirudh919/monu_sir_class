import java.util.Scanner;

public class rombus_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n/2;
        int nos = 1;
        while(row<=n){
            int i=0;
            while(i<nsp){
                System.out.print("  ");
                i++;
            }
            int j=0;
            int val=row;
            while(j<nos){
                System.out.print(val+" ");
                j++;
            }

            System.out.println();
            if(row<=(n+1)/2){
                nos--;
                nsp=nsp+2;
            }else {
                nos++;
                nsp=nsp-2;
            }
            row++;
        }
    }
}
