public class Is_present {
    public static void main(String[] args){
        String str = "abcbhjaijai";
        char ch = 'a';
        int i=2;
        System.out.println(Is_present(str,ch,i));
    }
    public static boolean Is_present(String str,char ch,int index){
        for(int i=index;i<str.length();i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
