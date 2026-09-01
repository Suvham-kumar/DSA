//Write a Java program to find the common elements between two arrays.

import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();

        int[] arr2 = new int[n1];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean isFound = false;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println("The Common element is: " + arr1[i]);
                    isFound =true;
                }
            }
        }
        if (!isFound) {
            System.out.println("No common element found.");
        }
    }
}
