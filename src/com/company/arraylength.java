package com.company;

import java.util.Scanner;

public class arraylength
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value in array size");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter value is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(+a[i]+" ");
        }

    }
}
