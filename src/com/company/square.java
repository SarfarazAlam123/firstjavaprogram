package com.company;

import java.util.Scanner;

public class square
{
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       double m=Math.sqrt(n);
        System.out.println("square of "+n+" is " +m);
    }
}
