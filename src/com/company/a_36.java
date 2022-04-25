package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class a_36
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            String s=Integer.toString(n);
            int l= s.length();
            System.out.println((n/(int)(Math.pow(10,l-1)))+(n%10));
        }
    }
}