package pers.cls.sort;

public class InsertSort {

    public static void main(String[] args) {

//        确保0-i上有序
        int[] arr = {4, 2, 1, 0, 5, 3};


        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {

                if (arr[j] <= arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }

        }

        for (int i : arr) {
            System.out.println(i);
        }

    }

}
