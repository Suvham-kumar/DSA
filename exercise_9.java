//Write a Java program to print all duplicate elements present in an array.

import java.util.Scanner;

public class exercise_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element is: " + arr[i]);
                    isFound = true;
                }
            }
        }
        if(!isFound){
            System.out.println("No duplicate");
        }
    }
}
