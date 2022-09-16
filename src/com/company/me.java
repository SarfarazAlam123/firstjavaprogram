package com.company;

import java.util.Scanner;

public class me {
    public static void main(String args [])
    {
     int n,c,r,t,s=0;
     Scanner sc=new Scanner(System.in);
        System.out.println("enter pallindrome number");
     n=sc.nextInt();
     c=n;
     while(n>0)
     {
        r=n%10;
         s=(s*10)+r;
        n=n/10;
     }
     if(c==s)
     {
         System.out.println("pallindrome number");
     }
     else{
         System.out.println("not pallindrome numbewr");
     }



    }
}
