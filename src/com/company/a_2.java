package com.company;
// { Driver Code Starts
import java.util.*;
class a_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ;i < n; i++)
                a[i]=sc.nextInt();
            GfG g = new GfG();
            System.out.println(g.palinArray(a , n));
        }
    }
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static int palinArray(int[] a, int n)
    {
        for(int i=0;i<n;i++)
        {
            int r=0;//result store
            int t=0;
            int s=a[i];
            while(s>0)
            {
                t=s%10;
                r=r*10+t;
                s=s/10;
            }
            if(r!=a[i])
            {
                return 0;
            }
        }
        return 1;
    }
}

