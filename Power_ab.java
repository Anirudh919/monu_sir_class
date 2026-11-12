public class Power_ab {
    public static void main(String[] args){
        int a=2,b=4;
        System.out.println(power(a,b));
    }
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }

        int res = power(a,b-1);
        return res*a;
    }
}
