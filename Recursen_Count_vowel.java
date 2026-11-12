//public class Recursen_Count_vowel {
//    public static void main(String[] args){
//        String s = "coding";
//        System.out.println(countVowel(s));
//        System.out.println(countVowelArr(s,0));
//    }
//    public static int countVowelArr(String s,int i){
//        if(s.length()==i){
//            return 0;
//        }
//        char ch=s.charAt(0);
//        int c=0;
//        if(ch == 'a' || ch == 'u' || ch == 'i'|| ch == 'o'|| ch == 'e'){
//            c=1;
//        }
////        return c+countVowel(s,i+1);
//    }
//    public static int countVowel(String s){
//       if(s.length()==0){
//           return 0;
//       }
//       char ch=s.charAt(0);
//       int c=0;
//       if(ch == 'a' || ch == 'u' || ch == 'i'|| ch == 'o'|| ch == 'e'){
//           c=1;
//       }
//       return c+countVowel(s.substring(1));
//    }
//}
