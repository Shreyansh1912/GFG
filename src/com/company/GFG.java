package com.company;

// Initial Template for Java

import java.io.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
                Ss1 sln = new Ss1();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Ss1 {
    int MissingNumber(int array[], int n) {
        int ans=0;
        for(int i=1;i<n+1;i++)
            ans=ans^i;
        for(int i=0;i<n-1;i++)
            ans=ans^array[i];
        return ans;
    }
}