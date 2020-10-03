import java.util.*; 
public class MergeSort<T extends Comparable <? super T>> implements Sorter <T> {

    public void sort(T[] A){
        mSort (A,0,A.length-1); 
    }

    private void mSort ( T[] a, int start, int end) {

        if (start >= end) return;
        int half = (start+end) / 2;
        mSort(a,start, half);
        mSort(a,half+1, end);
        merge(a,start, half, end);
    }

    private void merge( T[] a,int start, int half, int end) {
        T[] b = Arrays.copyOfRange(a, start, half+1);
        int i = 0; // index in b
        int j = half+1; // index in second half of a
        int k = start; // index in merged a
        while (i < b.length && j <= end )
            if (b[i].compareTo(a[j]) <= 0)
                a[k++] = b[i++];
            else
                a[k++] = a[j++];
        while (i < b.length) a[k++] = b[i++];
    } 

}