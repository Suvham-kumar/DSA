//Write a Java program to search a given element in a sorted array using Binary Search.

import java.util.Scanner;

public class exercise_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  sorted array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int left = 0;
        int right = n-1;
        boolean isFound = false;
        while (left <= right) {
            int mid = left + (right -  left) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                isFound = true;
                break;
            }

            else if (arr[mid] < target) {
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        if (!isFound) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
