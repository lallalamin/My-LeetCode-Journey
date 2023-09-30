package Java;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer index = check.get(nums[i]);
            if (index != null){
                return new int[]{index, i};
            }
            
            check.put(target - nums[i], i);
            
        }
        return nums;
    }
}