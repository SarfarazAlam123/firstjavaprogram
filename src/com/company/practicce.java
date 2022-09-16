package com.company;

import java.util.Scanner;

public class practicce {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }int start = 0;
          int end=arr.length-1;
         mergeSort( arr, start, end);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr

   static int[] mergeSort(int[] Arr, int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid+1, end);
            merge(Arr, start, mid, end);
        }
       return Arr;
   }
    static void merge(int Arr[], int start, int mid, int end) {

        // create a temp array
        int temp[] = new int[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = mid+1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while(i <= mid && j <= end) {
            if(Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = Arr[j];
                k += 1; j += 1;
            }
        }

        // add elements left in the first interval
        while(i <= mid) {
            temp[k] = Arr[i];
            k += 1; i += 1;
        }

        // add elements left in the second interval
        while(j <= end) {
            temp[k] = Arr[j];
            k += 1; j += 1;
        }

        // copy temp to original interval
       for(i = start; i <= end; i += 1) {
            Arr[i] = temp[i-start];
        }
    }
//    public static int[] implementMergeSort(int arr[], int start, int end)
//    {
//        if(start<end)//this is only for divisor part only then proceed to
//        {
//            int mid=(start+end)/2;
//            implementMergeSort(arr,start,mid);
//            implementMergeSort(arr,mid+1,end);
//            conquer(arr,start,mid,end);
//        }
//        return arr;
//    }
//
//    public static void conquer(int arr[],int start,int mid,int end)
//    {
//        int left = mid - start + 1;
//        int right = end - mid;
//        int L[] = new int[left];
//        int R[] = new int[right];
//        for(int i=0;i<left;i++)
//        {
//            L[i] = arr[i+start];
//        }
//        for(int j=0;j<right;j++)
//        {
//            R[j] = arr[mid+1+j];
//        }
//
//        int i=0, j=0;
//        int k = start;
//
//        while(i<left && j<right)
//        {
//            if(L[i] <=  R[j])
//            {
//                arr[k] = L[i];
//                i++;
//            }
//            else{
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<left)
//        {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        while(j<right)
//        {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc =new Scanner (System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }int start = 0;
//        int end=arr.length-1;
//        implementMergeSort(arr,start,end);
//        for(int i=start;i<=end;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();



      /*  Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();


        printNumbers(n, d);*/
   // }
//        int temp=0;
//        for(int i=1;i<=n;i++)
//        {
//                if(i==d){
//                    System.out.print(i+" ");
//                }

//                else if(i%10==d ||i/10==d){
//                    System.out.print(i+" ");
//                }
//            while(i>=1){
//                temp=i%10;
//                if(i==d){
//                    System.out.println(i+" ");
//                }
//                i=i/10;
//            }
//        }


    }
//}
