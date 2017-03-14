package main.array;

public class MergeSortedArray {

    public static void merge(int[] a1, int m, int[] a2, int n){
        int i1 = m - 1;
        int i2 = n - 1;
        int it = m + n - 1;

        while(i1 >= 0 && i2 >=0){
            if(a1[i1] >= a2[i2]){
                a1[it] = a1[i1];
                i1--;
                it--;
            } else if(a1[i1] < a2[i2]){
                a1[it] = a2[i2];
                i2--;
                it--;
            }

        }
        while(i1 >= 0){
            a1[it] = a1[i1];
            i1--;
            it--;
        }

        while(i2 >= 0){
            a1[it] = a2[i2];
            i2--;
            it--;
        }
    }
}
