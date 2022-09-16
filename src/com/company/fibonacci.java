package com.company;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int a=0,b=1,j,term;
        System.out.println("enter term");
        Scanner sc=new Scanner(System.in);
        term=sc.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.print(a+" ");
            j=a+b;
            a=b;
b=j;
        }
    }
}
