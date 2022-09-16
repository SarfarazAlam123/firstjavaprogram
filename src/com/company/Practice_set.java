package com.company;
import java.util.Scanner;

public class Practice_set {
    public static void main(String[] args) {

//   Q.1   what will be the result of the following expression float a = 7/4 * 9/2
//        float a =(7/4.0f * 9/2.0f);
//        System.out.println(a);

//   Q.2   Write  a java program to encrypt a grade by adding 8 to it. Decrypt to show the correct grade.
//        char grade = 'B';
//        grade = (char)(grade + 8);
//        System.out.println(grade);
//                                    // papa se chipa krke jb kisi ko code m grade batayenge to aise krenge.
//        Decrypting the grade
//        grade = (char) (grade-8);
//        System.out.println(grade);

//   Q.3  use comarison operators to find out whether a given number is greater than the user entered number or not.
        //  ------>> iske liye upar scanner use krna hoga
//        Scanner Sc = new Scanner(System.in);
//        int a = Sc.nextInt();
//        System.out.println(a>8);
//   Q.4  Write the following expression in a java programme V2-U2/2as
//        float v = 4f;
//        float u = 3f;
//        float a = 5f;
//        float s = 1f;
//        float k = (v*v - u*u ) / (2*a*s);
//        System.out.println(k);

//   Q.5 Find the value of the following expression:  int x=7,  int a = 7*49/7+35/7,  value of a =?
//        System.out.println(7*49/7+35/7);

//   ----------------------------------    NEXT CHAPTER ABOUT STRINGS    -----------------------------------------
//        String name = "Huzaifa" ;
//        System.out.println(name);

//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        System.out.println(st);

        //   Name length()
          String name = "Huzaifa";
          int value = name.length();
          System.out.println(value);

        //  Name toLowerCase()     // Jahan pr capital letter use tha wahan pr small ho jayega.
          String lstring = name.toLowerCase();
          System.out.println(lstring);

          // Name toUpperCase ()     //  Jahan pr lower letter hai upper case ho jayega.
        String ustring = name.toUpperCase();
        System.out.println(ustring);

      //        Name.trim
        String nonTrimmedString = "         Huzaifa       ";    // utna space le lega jitna likha hai
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();         // utna space nhi lega agar zayada bhi h to km lega.
        System.out.println(trimmedString);

        int a = 8;
        float b = 7.454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b); //---->8 digit space lekr likhayega or
                                                                     // 2f ka mtlb decimal m 2 digit aayega.
                               //0123456
                               //Huzaifa
        System.out.println(name.substring(3));   //----> 3 digit se lekr pura print hoga.
        System.out.println(name.substring(1,4)); //---> ye 0 ke baad 1 se 3 tk lega jitna likha hai usse ek km lega.

//                             Replace name digits with other digits
        System.out.println(name.replace("z" ,"j"));
        System.out.println(name.replace("z" , "ierier"));
        System.out.println(name.replace("aif" ,"kgp"));


        System.out.println(name.startsWith("Huz"));
        System.out.println(name.endsWith("err"));

        System.out.println(name.charAt(3));  //----> 3 number m jo hoga wo print ho jayega.
        System.out.println(name.indexOf("a"));  //----> index of krenge to wo batayega kitne number pr wo digit hai.

//        String modifiedName ="Harryrry";   //----> isse khin bhi name ko change kr skte hai modified name.
//        System.out.println(modifiedName.indexOf("rry",4));  //----> ab ye 4 indox chor kr khojega.
//        System.out.println(modifiedName.lastIndexOf("ry"));  //---> last index se khojega.

        System.out.println(name.equals("Huzaifa"));   //---> ye name string name m rahega to true nhi to false.
//   Ignore equal ka mtlb h ki name whi hone chahiye lekin letter small ya capital jo bhi ho ignore krega true aayega
        System.out.println(name.equalsIgnoreCase("huZAiFa"));

                            // Escape Sequence Character
        System.out.println("I am escape sequence \" double quote \"");












    }
}
