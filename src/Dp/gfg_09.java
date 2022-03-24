package Dp;

import java.util.HashMap;

class gfg_09 {
    public int tribonacci(int n) {
        return nthTrib(n, new HashMap<Integer, Integer>());
    }

    public int nthTrib(int n, HashMap<Integer, Integer> memo){

        if(n <= 1){
            return n;
        }

        if(n == 2){
            return 1;
        }

        int currentKey = n;

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int a = nthTrib(n-1, memo);
        int b = nthTrib(n-2, memo);
        int c = nthTrib(n-3, memo);

        memo.put(n, a + b + c);
        return a+b+c;
    }
}
