public class Lexicographical_Numbers {
    public static void main(String[] args){
        int n=1000;
        lexicographic(n,0);
        //386
    }
    public static void lexicographic(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr == 0){
           i=1;
        }
        for (;i<=9;i++){
            lexicographic(n,curr*10+i);
        }
    }
}