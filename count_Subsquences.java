public class count_Subsquences {
    public static void main(String[] args){
        String ques = "abc";
        System.out.println("\n"+Print(ques,""));
    }
    public static int  Print(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+"\t");
            return 1;
        }
        char ch=ques.charAt(0);
        int x = Print(ques.substring(1),ans);
        int y = Print(ques.substring(1),ans+ch);
      return x+y;
    }
}
