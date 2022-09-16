package com.company;
import java.util.Scanner;

public class question_practice1 {
    public static void main(String[] args) {

        // question 1  draw sum of three number code
        int a = 63;
        int b = 42;
        int c = 22;
        int sum = a + b + c;
        System.out.println(sum);

        // question 2 write a program to calculate CGPA using marks of three subjects (out of 100).
            float subject1 = 85;                   // int nhi float likhenge nhi to int m result aayega isliye result
            float subject2 = 95;                      // decimal m lane ke liye float use krenge
            float subject3 = 93;
            float cgpa = (subject1 + subject2 + subject3)/30;
            System.out.println(cgpa);

        // question 3 write a java program which asks the user to enter his/her name and "greets" them with
        // "Hello" <name>, have a good day "text"
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

        //question 4 write a java program to detect whether a number entered by the user is integer or not
             System.out.println("Enter your number");
//             Scanner sc = new Scanner(System.in);
             System.out.println(sc.hasNextInt());

        System.out.println("Taking Input From The User");
//        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
         System.out.println(b1);

    }
}
