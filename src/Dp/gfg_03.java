package Dp;

import java.util.HashMap;

class gfg_03 {
    public int change(int amount, int[] coins) {
        return totalWays(coins,0,amount,new HashMap<String, Integer>());
    }
    private int totalWays(int[] coins,int currentIndex,int amount,HashMap<String, Integer>memo){

        if(amount == 0)
            return 1;
        if(currentIndex == coins.length)
            return 0;

        String currentKey = Integer.toString(currentIndex) + "-" + Integer.toString(amount);

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        int currentCoin = coins[currentIndex];
        int consider = 0;

        if(currentCoin <= amount)
            consider = totalWays(coins, currentIndex, amount - currentCoin, memo);

        int notConsider = totalWays(coins, currentIndex+1,amount,memo);

        memo.put(currentKey, consider + notConsider);
        return consider + notConsider;
    }
}
