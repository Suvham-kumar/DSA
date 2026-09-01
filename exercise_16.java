//Write a Java program to remove duplicate elements from a sorted array.

import java.util.Scanner;

public class exercise_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        System.out.println("Remove duplicate element from the sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i < j+1; i++) {
            System.out.println(arr[i] + " ");
        }
    }   
}
