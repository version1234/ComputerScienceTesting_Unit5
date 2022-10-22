package com.hackbright.Unit5;

public class Part3SortingMain {

    public static void main(String[] args) {

        int[] intArray = {3, 7, 5,4, 9, 2, 6, 1, 8};
        System.out.println("Intiaal Array::");
        printArray(intArray);
        System.out.println("");
        System.out.println("Sorted Array::");
        printArray(insertionSort(intArray));
        System.out.println("");



    }
    static int[] insertionSort(int[] intArray){
//                Best Case : O(n) #Means array is already sorted.
//                Average Case : O(n²) #Means array with random numbers.
//                Worst Case : O(n²) #Means array with descending order.

        for(int i=0;i<intArray.length ;i++){
            for (int j=0; j<i+1; j++){
                if(intArray[i]<intArray[j]){
                    int temp = intArray[j];
                    intArray[j]= intArray[i];
                    intArray[i]= temp;
                }
            }
        }

        return intArray;
    }

    static void printArray(int[] intArray){
        for(int i=0;i<intArray.length; i++) {
            System.out.print(intArray[i]);
        }
    }
}

//                  For Quick Sort
//        Best Case : O(nlogn) #Means array is already sorted.
//        Average Case : O(nlogn) #Means array with random numbers.
//        Worst Case : O(n^2) #Means array with descending order.


//                  For Merge Sort
//        Best Case : O(nlogn) #Means array is already sorted.
//        Average Case : O(nlogn) #Means array with random numbers.
//        Worst Case : O(nlogn) #Means array with descending order.
