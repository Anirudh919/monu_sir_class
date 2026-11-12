public class reverse_number {
    public static void main(String[] args){
        int n=2345;
        int s=0;
        while(n!=0){
            int rem = n%10;
            s = s*10+rem;
            n=n/10;
        }
        System.out.println(s);
    }
}
