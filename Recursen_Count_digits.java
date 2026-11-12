public class Recursen_Count_digits {
    public static void main(String[] args){
        int n = 9876;
        System.out.println(Count_digit(n));
    }
    public static int Count_digit(int n){
        if(n==0){
            return 0;
        }
        int res =1;
        res+=Count_digit(n/10);
       return res;
    }
}
