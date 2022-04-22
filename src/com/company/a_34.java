package com.company;

import java.io.*;
import java.util.*;

class a_34 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
            Solution83 ob = new Solution83();
            System.out.println(ob.RedOrGreen(N, S));
        }
    }
}

class Solution83{
    static int RedOrGreen(int N, String S) {
        //code here
        int r=0,g=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='R')
                r++;
            else
                g++;
        }
        return Math.min(r,g);
    }
}
