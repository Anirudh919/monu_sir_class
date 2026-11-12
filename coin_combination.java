public class coin_combination {
    public static void main(String[] args){
        int[] coins = {2,3,1,5};
        int amount = 5;
        Combination(coins,amount,"",0);
    }
    public static void Combination(int[] coins,int amount,String ans,int idx) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coins.length; i++) {
            if (amount >= coins[i]) {
                Combination(coins, amount - coins[i], ans + coins[i],i); // index always run after that last index
            }

        }
    }
}
