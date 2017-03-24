package main.sort;

public class QuickSort {
    public static void sort(int[] arr){
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int low, int high){
        if(arr == null || arr.length < 2)
            return;
        int mid = (high + low) / 2;
        int pivot = arr[mid];
        int i = low, j = high;
        while(i <= j){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }

            if(i <= j){
                exchange(arr, i, j);
                i++;
                j--;
            }
        }
        if(low < j)
            sort(arr, low, j);
        if(high > i)
            sort(arr, i, high);
        return;
    }

    private static void exchange(int[] arr, int low, int high){
        int tmp = arr[low];
        arr[low] = arr[high];
        arr[high] = tmp;
    }
}
