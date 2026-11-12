import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    static String[] key = {"","","abc","def","gni","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args){
        String ques = "239";
        List<String> ll = new ArrayList<>();
        letter_combination(ques,"",ll);
        System.out.println(ll);
    }
    public static void letter_combination(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String s=key[ch - '0'];
        for(int i=0;i<s.length();i++){
            letter_combination(ques.substring(1),ans+s.charAt(i),ll);
        }
    }
}
