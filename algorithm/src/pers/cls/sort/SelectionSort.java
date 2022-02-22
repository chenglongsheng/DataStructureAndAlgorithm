package pers.cls.sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {2, 4, 51, 6, 1, 7, 3};

        /*
         * 第一轮循环依次移动数的下标，在n-1的数中找出最小数的下标
         */
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            /*
            第二轮循环选择出最小数的下标，交换数的下标
             */
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[minIndex] < arr[j] ? minIndex : j;


            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        for (int i : arr) {
            System.out.print(i + "\t");
        }


    }

}
