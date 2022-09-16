package com.company;

import java.util.Scanner;

public class ascend
{
    public static void main(String[] args)
    {
        int a[]=new int[5],i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter array value ");
        for(i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }

        System.out.println("  your ascend value is");

        for(i=0;i<a.length;i++)
        {
            for (j=i;j<a.length;j++)
            {
                if (a[i]<a[j])
                {
                  int  temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }

        }
        for(i=0;i<a.length;i++)
        {
        System.out.println(a[i]);

        }
    }
}
