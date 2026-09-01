// Write a Java program to rotate an array to the right by one position.

import java.util.Scanner;

public class exercise_15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Rotational Logic");
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}