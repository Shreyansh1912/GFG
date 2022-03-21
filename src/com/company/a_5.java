package com.company;
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Chocolate
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
            {
                long x = sc.nextInt();
                arr.add(x);
            }
            long m = sc.nextLong();

            a_5 ob = new a_5();

            System.out.println(ob.findMinDiff(arr,n,m));
        }

    }
}// } Driver Code Ends


//User function Template for Java
class a_5
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        long minDiff = Long.MAX_VALUE;
        for(int i=0;i<=n-m;i++) // i<arr.length-m
        {
            minDiff = Math.min(a.get(i+(int)m-1)-a.get(i),minDiff);
        }

        return minDiff;

    }
}
