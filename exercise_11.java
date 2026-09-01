//Write a Java program to check if there exists a pair of elements in the array whose sum is equal to a given target.

import java.util.Scanner;

public class exercise_11 {
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
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                    isFound = true;
                    break;
                }
            }
            if(isFound){break;}
        }
        if(!isFound){
            System.out.println("No pair found");
        }
    }
}
