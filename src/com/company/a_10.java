package com.company;
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class a_10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution76 obj = new Solution76();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution76
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String s[] = S.split("\\.");
        String reverse = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            reverse += s[i] + ".";
        }
        return reverse.substring(0,reverse.length() - 1);
    }
}
