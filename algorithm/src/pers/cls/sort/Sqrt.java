package pers.cls.sort;

public class Sqrt {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = right / 2;
            } else if (mid > x / mid) {
                right = right / 2;
                if (right < (x / right) && (right + 1) > (x / right)) {
                    return right;
                }
            }
        }
        return left + 1;
    }

    public int minimum(int[] arr) {
        if (arr.length == 1 || arr[0] < arr[1]) return 0;
        if (arr[arr.length - 1] < arr[arr.length - 2]) return arr[arr.length - 1];
        int left = 0;
        int right = arr.length - 2;
        int mid = -1;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
//        int i = sqrt.mySqrt(5);
//        System.out.println("i = " + i);
        int minimum = sqrt.minimum(new int[]{8, 5, 3, 7, 6, 70, 16});
        System.out.println("minimum = " + minimum);

        int i = nearestLeaf(new int[]{1, 3, 5, 7, 8}, 5);
        System.out.println("i = " + i);

    }

    public static int nearestLeaf(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        while (L <= R) {
            int mid = L + ((R - L) >> 1);
            if (arr[mid] >= value) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }

        }
        return index;
    }


}
