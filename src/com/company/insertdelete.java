package com.company;

import java.util.Scanner;

public class insertdelete {
    public static void main(String[] args) {
       int size,loc,item;
        System.out.println("enter array size");
        Scanner sc =new Scanner(System.in);
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter array element");
        for( int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.print("your enter element is : ");
        for( int i=0;i<size;i++)
        {

            System.out.println(a[i]+" ");
        }
        System.out.println("enter array location");
        loc=sc.nextInt();

        for(int i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }

        size--;
        for( int i=0;i<size;i++)
        {

            System.out.print(a[i]+" ");
        }

    }
}
