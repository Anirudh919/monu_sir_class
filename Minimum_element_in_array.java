public class Minimum_element_in_array {
    public static void main(String[] args){
       int[] arr={1,5,3,0};
        System.out.println(Minimum_arr(arr,0));
    }
    public static int Minimum_arr(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int res = Minimum_arr(arr,index+1);
        return Math.min(arr[index],res);
    }
}
