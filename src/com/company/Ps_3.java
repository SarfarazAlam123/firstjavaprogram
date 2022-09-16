package com.company;

public class Ps_3 {
    public static void main(String[] args) {
//  Question 1- Convert a string into lower case.
        String name = ("Md HUZAIFA");
        name = name.toLowerCase();
        System.out.println(name);

//  Question 2- Write a Java program to replace spaces with underscores.
         String text = "To Lower Case";
         text = text.replace(" " ,"_");
         System.out.println(text);

//  Question 3- Write a Java program to fill in a letter template which looks like- letter = "Dear</name/> ,Thanks alot"
//      Replace </name/> with a string (some name)
        String letter = "Dear </name/> , Thanks a lot!";
        letter = letter.replace("</name/>","Huzaifa");
        System.out.println(letter);

//  Question 4- write a Java progarm to detect double and triple spaces in a string.
        String myString = "This string contains       double and triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf(" "));



    }
}
