//Write a Java program to count how many times a given element appears in an array.
import java.util.Scanner;
public class exercise_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + count);
    }
}
