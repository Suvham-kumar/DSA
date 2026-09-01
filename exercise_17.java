//Write a Java program to merge two sorted arrays into a single sorted array.

import java.util.Scanner;

public class exercise_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the array2: ");
        int n1 = sc.nextInt();

        int[] arr2 = new int[n1];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;
        int i =0;
        int j=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] <arr2[j]) {
                merged[k] = arr1[i];
                i++;
            }else{
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        for (i = 0; i< merged.length; i++) {
            System.out.print("Sorted Array is: " + merged[i]);
        }
    }
}
