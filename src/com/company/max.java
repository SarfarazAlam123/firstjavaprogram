package com.company;

import java.util.Scanner;

public class max
{
    public static void main(String[] args)
    {
      int n,i,r;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;n>0;i++)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;


        }
    }
}
