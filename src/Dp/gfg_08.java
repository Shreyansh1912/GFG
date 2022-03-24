package Dp;

import java.util.HashMap;

class gfg_08 {
    public int fib(int n) {
        return nthFib(n,new HashMap<Integer,Integer>());
    }
    public int nthFib(int n,HashMap<Integer,Integer> memo)
    {
        if(n<=1)
            return n;

        if(memo.containsKey(n))
            return memo.get(n);

        memo.put(n,nthFib(n-1,memo) + nthFib(n-2,memo));

        return memo.get(n);
    }
}
