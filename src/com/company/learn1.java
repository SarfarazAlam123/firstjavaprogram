package com.company;
import javax.swing.*;
import java.util.Scanner;

public class learn1 {
    public static void main(String[] args) {

//        This question is taking user input and sum 2 digits

//        int a,b,c;
//        System.out.println("Enter your number: ");
//        Scanner s=new Scanner(System.in);
//        a=s.nextInt();
//        b=s.nextInt();
//        c=a+b;
//        System.out.println("your answer is: "+c);

//   ---------------If Condition with else condition both--------------
//        int pwd;
//        System.out.print("Enter Password:= ");
//        Scanner sc=new Scanner(System.in);
//        pwd=sc.nextInt();
//        if(pwd==2002)
//        {
//            System.out.println("My name is Huzaifa");
//            System.out.println("My age is 22");
//            System.out.println("My address is Kohnasarai");
//            System.out.println("My contact number is 9693089075");
//        }
//         else
//        {
//            System.out.println("Sorry your password is wrong:");
//        }
//   question. Make a age division who is eligible or not for voting process.

//       int age;
//        System.out.println("Enter your age:");
//        Scanner a=new Scanner(System.in);
//        age=a.nextInt();
//        if(age>=18)
//        {
//            System.out.println("You are eligible for voting.");
//            System.out.println("your vote is very important.");
//        }
//        else
//        {
//            System.out.println("You are not eligible for voting.");
//            System.out.println("You are not Perfect for voting.");
//        }
//     --------------else if ---------------
       int marks;
        System.out.println("Enter Marks:");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if (marks>=80 && marks<=100)
        {
            System.out.println("First Division");
        }
        else if (marks>=45 && marks<=60)
        {
            System.out.println("Second Division");
        }
        else if (marks>=30 && marks<=44)
        {
            System.out.println("Third Division");
        }
       else
       {
           System.out.println("Fail");
       }
// --------------  Nested if else --------------






    }

}
