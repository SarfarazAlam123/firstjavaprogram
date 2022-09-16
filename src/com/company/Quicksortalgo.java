package com.company;

import java.util.Arrays;

public class Quicksortalgo {
    public static void main(String[] args) {
        int a[]={7,6,7,5,9,2,1,15,10};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(a));
        int start=0;
        int size=a.length;
        int end=size-1;
        quickSort(a,start,end);
        System.out.println("sorted Array");
        System.out.println(Arrays.toString(a));


    }

    public static void quickSort(int[]a,int lb,int ub)
    {
        if(lb<ub)
        {
           int loc= partition(a,lb,ub);
            quickSort(a,lb,loc-1);
            quickSort(a,loc+1,ub);
        }
    }



        public static int partition(int[]a, int lb, int ub) {
        int pivot=a[lb];
        int start=lb;
        int end=ub;
        while (start<end){
            while (a[start]<=pivot)
            {
                start++;
            }
                while(a[end]>pivot)
                {
                    end--;
                }
                    if(start<end)
                    {
                        int temp=a[start];
                        a[start]=a[end];
                        a[end]=temp;
                    }
        }
        int temp=a[end];
        a[end]=a[lb];
        a[lb]=temp;
            return end;
    }




}
