import java.util.Scanner;

public class Pattern_with_Zeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1,nst=1;
        while (row<=n){
            int i =1;
            while (i<=nst){
                if(i==1 || i==nst){
                    System.out.print(row+" ");
                }else {
                    System.out.print(0+" ");
                }
                i++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
