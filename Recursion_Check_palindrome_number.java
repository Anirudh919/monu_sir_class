public class Recursion_Check_palindrome_number {
    public static void main(String[] args){
        int n=121;
        int compare = check_palidrome(n,0);
        if(n==compare){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static int check_palidrome(int n,int sum){
        if(n==0){
            return sum;
        }
        sum = (sum*10)+(n%10);
        return check_palidrome(n/10,sum);
    }
}
