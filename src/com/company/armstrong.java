package com.company;

import java.util.Scanner;

public class armstrong
{
    public static void main(String[] args) {
        int n,c,r=0,arm;
        System.out.println("enter any number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
         arm=n%10;
           r=(arm*arm*arm)+r;
           n=n/10;
        }
        if(c==r)
        {
            System.out.println("yes it is");
        }
        else
        {
            System.out.println("not possible is");
        }
    }

}
