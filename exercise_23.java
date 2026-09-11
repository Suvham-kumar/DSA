    //wap to find the two sum II - innput array is sorted.

    import java.util.Scanner;

    public class exercise_23 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the Array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the element:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int left =0;
            int right = arr.length-1;
            System.out.print("Enter the target element: ");
            int target = sc.nextInt();
            boolean found =false;
            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("[" + (left+1) + ", " + (right+1) + "]");
                    found = true;
                    break;
                }else if(sum < target){
                    left++;
                    
                }else if (sum > target) {
                    right--;
                    
                }
            }
            if (!found) {
                System.out.println("No pair found");
            }
        }
    }
