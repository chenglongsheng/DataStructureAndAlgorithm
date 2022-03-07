package pers.cls.sort;

public class BinarySearch {

    public int binarySearch(int[] arr, int tar) {
        int index = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] > tar) {
                index = mid;
                right = mid - 1;

            } else if (arr[mid] < tar) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0, 45, 56, 78, 90, 100};

        BinarySearch binarySearch = new BinarySearch();
        int i = binarySearch.binarySearch(arr, 56);
        System.out.println("i = " + i);

        int[] ints = binarySearch.searchRange(arr, 78);
        for (int j = 0; j <ints.length; j++) {
            System.out.println("j = " + j);
        }

    }

    public int[] searchRange(int[] nums, int target) {
        int targetIndex = binarySearch(nums, target);
        int left = targetIndex;
        int right = targetIndex;
        while (left - 1 >= 0 && nums[targetIndex] == nums[left - 1]) {
            left--;
        }
        while (right + 1 <= nums.length - 1 && nums[targetIndex] == nums[right + 1]) {
            right++;
        }
        return new int[]{left, right};
    }

    public int searchInsert(int[] nums, int target) {

        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] > target) {
                index = mid;
                right = mid - 1;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return index;
    }

}
