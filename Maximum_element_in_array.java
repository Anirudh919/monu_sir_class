public class Maximum_element_in_array {
    public static void main(String[] args){
        int[] arr = {1, 5, 3 , 7,4};
        System.out.println(maximum_element(arr,0));
    }
    public static int maximum_element(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int res = maximum_element(arr,index+1);
        return Math.max(arr[index],res);
    }
}
