public class recursion_Reverse_a_number {
    public static void main(String[] args){
        int n =123;
        System.out.println(Reverse_num(n,0));
    }
    public static int Reverse_num(int n,int ans){
        if(n==0){
            return ans;
        }
        int rem = n%10;
        return Reverse_num(n/10,(ans*10)+rem);
    }
}
