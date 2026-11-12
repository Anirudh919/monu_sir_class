public class Backtracking {
    public static void main(String[] args){
        int n=4;
        boolean[] board = new boolean[n];
        int tq=2;
        Permution(board,tq,"",0);
    }
    public static void Permution(boolean[] board,int tq,String ans,int qpsf){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i] == false){
                board[i] =true;
                Permution(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
                board[i]=false;
            }
        }
    }
}
