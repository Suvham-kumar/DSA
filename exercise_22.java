//Wap to find the longest consecutive sequence.

import java.util.HashSet;
import java.util.Scanner;

public class exercise_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        int maxlength = 0;
        for(int i: arr){
            set.add(i);
            
            if (!set.contains(i-1)) {
                int length = 1;
                while (set.contains(i+1)) {
                    length++;
                    i++;
                }

                if (length > maxlength) {
                    maxlength = length;
                }

            }

        }
        System.out.println("Consecutive length: " + maxlength);
    
    }
}