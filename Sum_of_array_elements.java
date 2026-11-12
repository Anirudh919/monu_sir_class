public class Sum_of_array_elements {
    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println(Sum_arr(arr,arr.length));
    }
    public static int Sum_arr(int[] arr,int n){
       if(n<=0){
           return 0;
       }
       return arr[n-1]+Sum_arr(arr,n-1);
    }
}
