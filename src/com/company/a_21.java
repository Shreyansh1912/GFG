package com.company;
import java.io.*;
import java.util.*;

public class a_21 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int len=sc.nextInt();
        int a[]=new int[len];
        for(int i=0;i<len;i++)
            a[i]=sc.nextInt();

        int c=0,ans=0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] == a[j]) {
                    ans= a[i];
                    c++;
                    break;
                }
            }
        }


        if(c==0)
            ans=len;

        System.out.println(ans);

    }
}
