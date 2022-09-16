package com.company;

import java.util.Scanner;

public class array {
     static void Swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
         System.out.println(a+" "+b);

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();

//        int a[] = new int[size];
//
//        for (i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("printed array");
//        for (i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.print("enter that you want to search");
//        n = sc.nextInt();
//        for (i = 0; i < a.length; i++) {
//
//            if (n == a[i]) {
//                count++;
//            }
//        }
//            if (count>0)
//            {
//                System.out.println("item found " +count+" times ");
//            } else {
//                System.out.println("invalid not found");
//            }



        // for(i=0;i<a.length;i++)
        // {
        //    sum=a[i]+sum;
        //  }
        // System.out.println("sum of all value "+sum);
        Swap(a , b);






    }

    }

