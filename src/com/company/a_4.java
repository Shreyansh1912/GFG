package com.company;
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            a_4 ob = new a_4();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans)
                System.out.print(val);
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class a_4{
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> list = new ArrayList<>();
        java.math.BigInteger F;
        F = java.math.BigInteger.valueOf(1);
        for(int i=2;i<=N;i++){
            F = F.multiply(java.math.BigInteger.valueOf(i));
        }
        String val = F.toString();

        char[] ch = val.toCharArray();
        for(int i=0;i<ch.length;i++){
            int k=Integer.parseInt(String.valueOf(ch[i]));
            list.add(k);
        }
        return list;
    }
}
