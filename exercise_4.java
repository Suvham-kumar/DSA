//Write a Java program to check whether an array is sorted in ascending order.

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = true;
                break;
            }
        }
        if (!isSorted) {
            System.out.println("Array not sorted");
        }
        else{
            System.out.println("Array Sorted");
        }

    }

}
