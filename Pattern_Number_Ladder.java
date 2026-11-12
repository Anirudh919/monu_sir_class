import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row =0;
        int val = 1;
        while (row<n){
            int i =0;
            while(i<nst){
                System.out.print(val+"\t");
                val++;
                i++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
