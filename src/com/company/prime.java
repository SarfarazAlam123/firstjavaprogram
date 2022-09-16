package com.company;

import java.util.Scanner;

public class prime
{
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        for (i=1;i<n;i++)
        {
            if (n%i==0)
            {
                sum=sum+i;
            }
        }
        if (sum==n)
        {
            System.out.println("perfect number");
        }else{
            System.out.println("not perfect");
        }
    }
}
