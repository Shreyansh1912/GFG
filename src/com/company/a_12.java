package com.company;
import java.util.*;
class a_12 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            long brr[]=new long[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++)
            {
                brr[i]=sc.nextLong();
            }
            Solution99 ob = new Solution99();
            System.out.println(ob.check(arr,brr,n)==true?"1":"0");
        }
    }
}
class Solution99{
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++)
        {
            if(A[i]!= B[i])
                return false;
        }
        return true;
    }
}
