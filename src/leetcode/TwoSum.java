package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumBruteforce(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        throw new RuntimeException("No pair of elements in nums sum to target: " + target);
    }

    public static int[] twoSumMap(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> numsIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsIndices.containsKey(target - nums[i])) {
                result[0] = numsIndices.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                numsIndices.put(nums[i], i);
            }
        }

        throw new RuntimeException("No pair of elements in nums sum to target: " + target);

    }

}
