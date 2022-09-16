package com.company;

import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        int y,r,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
     y=sc.nextInt();
       while (y>0)
       {
           r=y%10;
           sum=sum+r;
           y=y/10;

       }System.out.println(sum);
    }




}
