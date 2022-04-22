package com.company;

import java.io.*;
import java.util.*;

class a_33{
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution93 ob = new Solution93();
            System.out.println(ob.getGray(n));
        }
    }
}// } Driver Code Ends


class Solution93 {
    static int getGray(int n) {
        // code here
        return n^(n>>1);
    }
}
