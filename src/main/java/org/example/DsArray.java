package org.example;

public class DsArray {
    public static void main(String[] args) {
        DsArray dsArrayObj = new DsArray();
        int[] arr = {4, 5, 6, 1, 2, 3, 4};
        dsArrayObj.canBeSortedAfterShift(arr);
    }

    private void canBeSortedAfterShift(int[] arr) {
        int firstMinIndex = 0;
        int nextMinIndex = 0;
        boolean canSorted = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[i + 1]) {
                firstMinIndex = i;
                break;
            }
        }
        for (int i = firstMinIndex + 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] < arr[i - 1]) {
                nextMinIndex = i;
                break;
            }
        }
        // System.out.println(firstMinIndex + " " + nextMinIndex);
        for (int i = nextMinIndex + 1; i < arr.length; i++) {
            if (firstMinIndex != nextMinIndex) {
                if (arr[i] < arr[i - 1] || arr[i] > arr[firstMinIndex]) {
                    canSorted = false;
                    break;
                }
            }
        }
        if (canSorted)
            System.out.println("Yes, array an be sorted after certain rotations");
        else
            System.out.println("No, array can not be sorted");
    }
}