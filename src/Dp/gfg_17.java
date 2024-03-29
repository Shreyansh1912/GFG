package Dp;

import java.util.HashMap;

class gfg_17{
    public int maxProfit(int k, int[] prices) {
        return bestBuy(prices,0, 1, k, new HashMap<String,Integer>());
    }
    public int bestBuy(int[] prices, int currentDay, int canBuy, int transCount, HashMap<String,Integer> memo){

        if(currentDay >= prices.length || transCount<=0)
            return 0;

        String currentKey = Integer.toString(currentDay) + "_" + Integer.toString(canBuy) + "_" + Integer.toString(transCount);

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        if(canBuy==1){
            int idle = bestBuy(prices, currentDay + 1, canBuy, transCount, memo);
            int buy = bestBuy(prices, currentDay + 1, 0, transCount, memo) - prices[currentDay];

            memo.put(currentKey,Math.max(idle,buy));
            return memo.get(currentKey);
        }
        else
        {
            int idle = bestBuy(prices, currentDay + 1, canBuy, transCount, memo);
            int sell = bestBuy(prices, currentDay + 1, 1, transCount - 1, memo) + prices[currentDay];

            memo.put(currentKey,Math.max(idle,sell));
            return memo.get(currentKey);
        }

    }
}
