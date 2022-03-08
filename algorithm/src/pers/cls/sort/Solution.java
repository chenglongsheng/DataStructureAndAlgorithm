package pers.cls.sort;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] + nums[j + 1] == target) {
                    a = i;
                    b = j + 1;

                }
            }
        }
        return new int[]{a, b};
    }

    public int minWastedSpace(int[] packages, int[][] boxes) {
        return 0;
    }

    public static int removeElement(int[] nums, int val) {

        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[fastIndex - 1]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                ans[pos] = nums[j] * nums[j];
                j--;
            } else {
                ans[pos] = nums[i] * nums[i];
                i++;
            }
            pos--;
        }
        return ans;
    }

}
