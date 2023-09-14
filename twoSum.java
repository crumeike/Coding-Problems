class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}

//test case
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Indices of numbers that add up to the target: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}