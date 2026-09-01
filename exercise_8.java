//Write a Java program to find the missing number in an array.

import java.util.Scanner;

public class exercise_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n-1];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int expectedSum;
        int actualSum = 0;
        int missingNumber;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        expectedSum = n * (n+1) / 2;
        missingNumber = expectedSum - actualSum;

        System.out.print("The missing value is : " + missingNumber);
    }
}
