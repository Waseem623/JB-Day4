package org.example;

public class DsArray_ShiftElements {
    public static void main(String[] args) {
        DsArray_ShiftElements dsArray_shiftElementsObj=new DsArray_ShiftElements();
        int[] arr = {8,9,5,6,7};
        dsArray_shiftElementsObj.shiftArray(arr, 6);

    }

    private void shiftArray(int[] arr, int n) {
        int counter = 0;
        while (counter < n) {
            int j, last;
            last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
            counter++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}