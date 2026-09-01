// WAP to  find the target value int the array using linear search
import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println("Enter the target value do you want to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Array found at index at : " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
}