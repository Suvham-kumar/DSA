// wap to find the product of an array itself.
public class exercise_26 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < leftProduct.length; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }

        int[] rightProduct = new int[nums.length];
        rightProduct[nums.length-1] = 1;
        for (int i = rightProduct.length-2; i>=0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i+1];
        }

        int[] answers = new int[nums.length];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = leftProduct[i] *  rightProduct[i];
        }

        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i] + " ");
        }
    }
}
