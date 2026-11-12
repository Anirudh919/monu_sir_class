public class recursion_Product_of_digits {
    public static void main(String [] args){
        int n = 234;
        System.out.println(Product_digit(n));
    }
    public static int Product_digit(int n){
        if(n==0){
            return 1;
        }
        int res = Product_digit(n/10);
        return (n%10)*res;
    }
}
