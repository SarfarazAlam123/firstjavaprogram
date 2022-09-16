package com.company;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;


public class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("ArrayList without any elements:");
        System.out.println(a);
        for(int i = 0; i < 5; i++) {
            a.add(i * 100);
           // System.out.println(a);
        }
        System.out.println(a);
        a.add(4, 800);
        System.out.println(a);
       // System.out.println("enter the nu.");
        //int x= scanner.nextInt();
       // a.add(x);
       // System.out.println(a);
        a.remove(Integer.valueOf(200));
        System.out.println(a);
        System.out.println("removing all");
       // a.removeAll(a);
        System.out.println("a wala"+a);
       // collection .sort(a);
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(23);
        a1.add(1020);
        a1.add(32);
        a1.add(80);
        a1.add(00);
        System.out.println(a1);

        Collections.sort(a1);
        System.out.println(a1);
         int num=a1.indexOf(1);
        System.out.println(num);
    }
}
