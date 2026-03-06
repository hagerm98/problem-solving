package leetcode;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int position = nums.length - 1;

        while (left <= right) {

            int leftSquared = nums[left] * nums[left];
            int rightSquared = nums[right] * nums[right];

            if (leftSquared > rightSquared) {
                result[position] = leftSquared;
                left++;

            } else {
                result[position] = rightSquared;
                right--;
            }

            position--;
        }

        return result;
    }
}