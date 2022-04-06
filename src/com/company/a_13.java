package com.company;

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class testt
{
    long first, second;
    public testt(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

class a_13 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Compute obj = new Compute();
            testt product = obj.getMinMax(a, n);
            System.out.println(product.first+" "+product.second);

        }
    }
}

// } Driver Code Ends


//User function Template for Java

/*
 class testt
{
    long first, second;
    public testt(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
} */

class Compute
{
    static testt getMinMax(long a[], long n)
    {
        long min = a[0],max=a[0];
        for(long i : a){
            if(min>i)
                min = i;
            if(max<i)
                max = i;
        }
        return new testt(min,max);
    }
}

