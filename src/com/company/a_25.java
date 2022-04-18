package com.company;


import java.util.*;
import java.io.*;

public class a_25 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution26().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution26 {
    int count(int[] arr, int n, int x) {
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                c++;
        }
        return c;
    }
}
