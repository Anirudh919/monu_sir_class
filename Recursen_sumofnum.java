public class Recursen_sumofnum {
    public static void main(String[] args){
        int n=5;
        System.out.println(sum_of_num(n));
    }
    public static int sum_of_num(int n){
        if (n==0){
            return 0;
        }
        int res = sum_of_num(n-1);
        return res+n;
    }
}
