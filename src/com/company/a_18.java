package com.company;

// { Driver Code Starts
//Initial Template for Java

import java.lang.*;
import java.io.*;

class a_18 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            compute obj = new compute();
            System.out.println(obj.largest(a, n));

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class compute {

    public int largest(int arr[], int n)
    {
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max=arr[i];
            }

        }
        return max;
    }
}
