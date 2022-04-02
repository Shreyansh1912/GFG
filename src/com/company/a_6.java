package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class a_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            test obj = new test();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class test
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int low=0,high=0,sum=arr[0];

        while(low < n && high < n){
            if(sum==s){
                list.add(low+1);
                list.add(high+1);
                break;
            }
            else if(sum < s && high < n-1){
                sum = sum + arr[++high];
            }
            else{
                sum = sum - arr[low++];
            }
        }
        if(list.isEmpty())
            list.add(-1);

        return list;

    }
}
