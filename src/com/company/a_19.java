package com.company;

// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class a_19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            Solution7 g = new Solution7();
            System.out.println(g.thirdLargest(arr,n));
            t--;
        }
    }
}// } Driver Code Ends


class Solution7
{
    int thirdLargest(int a[], int n)
    {
        Arrays.sort(a);
        if(n<3) return -1;
        return a[n-3];
    }
}