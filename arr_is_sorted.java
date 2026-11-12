public class arr_is_sorted {
    public static void main(String[] args){
        int[] arr = {3,5,7,8,9};
        System.out.println(Sorted(arr,0));
    }
    public static boolean Sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
      if(arr[index]>arr[index+1]){
          return false;
      }
     return Sorted(arr,index+1);
    }
}
