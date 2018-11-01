package _1_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{2, 7, 11, 15};
    }
}
