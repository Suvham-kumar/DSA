//Find the First Occurrence of an Element in a Sorted Array

import java.util.Scanner;

public class exercise_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  sorted array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int left = 0;
        int right = n-1;
        int answer=-1;
        while (left <= right) {
            int mid = left + (right - left) /2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid-1;
            }
            else if (arr[mid] < target) {
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        if (answer == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("First occurences at index: " + answer);
        }
    }
}
