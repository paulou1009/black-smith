package main.array;

public class NationalFlag {

    public static void getNationalFlag(int[] a, int pivotIndex){
        int pivot = a[pivotIndex];
        int small = 0;
        int equal = 0;
        int large = a.length -1 ;

        while(equal < large){
            if(a[equal] < pivot){
                a[small] = a[equal];
                small++;
                equal++;
            } else if(a[equal] == pivot){
                equal++;
            } else {
                a[equal] = a[large];
                large--;
            }
        }
    }
}
