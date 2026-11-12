import java.util.Scanner;

public class Fibonacci_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1,i=0,nst=1;
        while(i<n){
            int j=0;
            while (j<nst){
                System.out.print(a+"\t");
                int c=a+b;
                a=b;
                b=c;
                j++;
            }
            System.out.println();
            nst++;
            i++;
        }
    }
}
