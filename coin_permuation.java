public class coin_permuation {
    public static void main(String[] args){
        int[] coins = {2,3,1,5};
        int amount = 3;
        Permuation(coins,amount,"");
    }
    public static void Permuation(int[] coins,int amount,String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coins.length;i++){
          if(amount>=coins[i]){
              Permuation(coins,amount-coins[i],ans+coins[i]);
          }

        }
    }
}
