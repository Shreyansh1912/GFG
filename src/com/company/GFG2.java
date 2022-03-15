package com.company;

import java.util.*;
public class GFG2
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();

            int arr[] =  new int[l];

            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();

            solution ob = new solution();

            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);

            else
                System.out.println(-1);

        }

    }
}// } Driver Code Ends


//User function Template for Java

class solution
{

    private boolean bin_search(int arr[], int low, int high, int target)
    {
        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[mid]==target) return true;
            else if(arr[mid]>target) high = mid - 1;
            else low = mid + 1;

        }

        return false;
    }

    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);

        for(int i=0; i<size; i++)
        {
            if(bin_search(arr, i+1, size-1, n+arr[i])) return true;
        }

        return false;

    }
}






