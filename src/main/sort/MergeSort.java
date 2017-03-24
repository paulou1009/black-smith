package main.sort;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return arr;

        int[] sub1 = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] sub2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        sub1 = sort(sub1);
        sub2 = sort(sub2);

        int[] res = new int[arr.length];

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < sub1.length && j < sub2.length) {
            if (sub1[i] <= sub2[j]) {
                res[index] = sub1[i];
                i++;
                index++;
            } else {
                res[index] = sub2[j];
                j++;
                index++;
            }
        }
        while(i < sub1.length){
            res[index] = sub1[i];
            i++;
            index++;
        }
        while(j < sub2.length){
            res[index] = sub2[j];
            j++;
            index++;
        }
         return res;
    }
}
