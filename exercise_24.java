// wap to find the container with most water.

import java.util.Scanner;

public class exercise_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the hight: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter the water height: ");
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        int left =0;
        int right = height.length-1;
        int maxWater = 0;
        while (left < right) {
            int width = right - left;
            int maxHeight = Math.min(height[left], height[right]);
            int currentWater = width * maxHeight;
            if (currentWater > maxWater) {
                maxWater = currentWater;
            }
            if (height[left] < height[right]) {
                left++;
            }
            else if (height[left] > height[right]) {
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        System.out.println("Max water: " + maxWater);
    }
}