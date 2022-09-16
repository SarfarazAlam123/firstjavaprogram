package com.company;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int a,i,count=0;
        System.out.println("enter any number");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        for(i=0;a>0;a=a/10)
        {

            count++;

            System.out.println(count);
        }
        System.out.println(count);


    }
}
