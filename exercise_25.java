// Wap to find the maximum trapping rain water

import java.util.Scanner;

public class exercise_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the building: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the height of the building: ");
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        
        int totalWater = 0;
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
            
        }
        int[] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        
        for (int i = 0; i < rightMax.length; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        System.out.println("Total trapped water: "+ totalWater);
    }
}
