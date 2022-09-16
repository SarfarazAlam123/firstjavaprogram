package com.company;

public class star {
    public static void main(String[] args) {
        int i,k;
        for(i=1;i<=5;i++)
        {

            for(k=1;k<=5;k++)
            {
                if(i==1 || i==5 || k==1 || k==5)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
