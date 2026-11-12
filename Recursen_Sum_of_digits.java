public class Recursen_Sum_of_digits {
   public static void main(String[] args){
       int n=123;
       int val=n/10;
       System.out.println(Sum_of_digit(n));
   }
   public static int Sum_of_digit(int n){
       if(n==0){
           return 0;
       }
       int res = Sum_of_digit(n/10);
       return (n%10)+res;
   }
}
