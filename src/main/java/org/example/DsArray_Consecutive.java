package org.example;

import java.util.Arrays;

public class DsArray_Consecutive {

    public static void main(String[] args) {
        //int[] arr = {1, 3, 2, 3, 10, 11, 12, 1, 1, 1, 14, 15, 16, 17};
        int[] arr = {1, 3, 2, 3, 10, 11, 12, 1, 1, 1};
        DsArray_Consecutive dsArray_consecutiveObj = new DsArray_Consecutive();
        dsArray_consecutiveObj.checkConsecutives(arr);
    }

    private void checkConsecutives(int[] arr) {
        int start = 0;
        int end = 0;
        int flag = 0;
        int temp = 0;
        while (flag < arr.length) {
            for (int i = end + 1; i < arr.length; i++) {
                if (arr[i - 1] <= arr[i]) {
                    start = i - 1;
                } else {
                    start = i;
                }
                break;
            }
            for (int i = start + 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1] && arr[i] != arr[i - 1]) {
                    end = i - 1;
                    break;
                } else
                    end = i;
            }
            if (start == end) {
                continue;
            }
            if (temp != end) {
                printArray(arr, start, end);
                temp = end;
            } else break;
            flag++;
        }
    }

    private void printArray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}