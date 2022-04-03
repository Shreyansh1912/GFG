package com.company;

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class a_9 {

    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];

            Solution87 obj = new Solution87();

            if(obj.isAnagram(s1,s2))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }



        }
    }
}// } Driver Code Ends


class Solution87
{
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        char[] a1=a.toCharArray();
        char[] a2=b.toCharArray();

        int l1=a1.length;
        int l2=a2.length;

        Arrays.sort(a1);
        Arrays.sort(a2);
        int c=0;

        if(l1==l2){
            for(int i=0;i<l1;i++){
                if(a1[i]==a2[i]){
                    c++;
                }
            }
        }
        if(c==l1 && c==l2){
            return true;
        }
        return false;

    }
}

