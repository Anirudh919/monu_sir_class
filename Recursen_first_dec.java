public class Recursen_first_dec {
    public static void main(String[] args){
        int [] arr = {2,3,4,5,4};
        int item=4;
        System.out.println(Search_index(arr,item,0));
    }
    public static int Search_index(int[] arr,int item,int index){
       if(arr.length==item) {
           return -1;
       }
        if(arr[index]==item){
                return index;
            }
        return Search_index(arr,index,index+1);
    }
}
