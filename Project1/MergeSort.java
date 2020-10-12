
import java.util.*; 
/**
 * Merge Sort Algorithm Implementation.   
 *  This program was copied from the Prof. Ge Xia's lecture 
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class MergeSort<T extends Comparable <? super T>> implements Sorter <T> {

    public <T extends Comparable<? super T>> void sort (T[] a) {
        Msort ( a,0, a.length-1);
    }    
    /**
     * Perform the merge Sort recursion 
     *
     * @param  a  array
     * @param start first index 
     * @param end end index
     */ 
    public <T extends Comparable<? super T>> 
    void Msort (T[] a, int start, int end) {
        if (start >= end) return;
        int half = (start+end) / 2;
        Msort(a, start, half);
        Msort(a, half+1, end);
        merge(a, start, half, end);
    }

    private <T extends Comparable<? super T>>  void
    merge(T[] a, int start, int half, int end) {
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

    /**
     * Sort an array of ints. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a){ Msort ( a,0, a.length-1);}

    /**
     * Perform the merge Sort recursion 
     *
     * @param  a  array
     * @param start first index 
     * @param end end index
     */ 
    public static <T extends Comparable<T>>
    void Msort (int[] a, int start, int end) {
        if (start >= end) return;
        int half = (start+end) / 2;
        Msort(a, start, half);
        Msort(a, half+1, end);
        merge(a, start, half, end);
    }

    private static <T extends Comparable<T>> void
    merge(int[] a, int start, int half, int end) {
        int[] b = Arrays.copyOfRange(a, start, half+1);
        int i = 0; // index in b
        int j = half+1; // index in second half of a
        int k = start; // index in merged a
        while (i < b.length && j <= end )
            if (b[i]<=a[j])
                a[k++] = b[i++];
            else
                a[k++] = a[j++];
        while (i < b.length) a[k++] = b[i++];
    } 

    /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c){Msort ( a,0, a.length-1,c);}

    /**
     * Perform the merge Sort recursion 
     *
     * @param  a  array
     * @param start first index 
     * @param end end index
     */ 
    public <T>
    void Msort (T[] a, int start, int end, Comparator<T> c) {
        if (start >= end) return;
        int half = (start+end) / 2;
        Msort(a, start, half,c);
        Msort(a, half+1, end,c);
        merge(a, start, half, end,c);
    }

    private <T> void
    merge(T[] a, int start, int half, int end, Comparator<T> c) {
        T[] b = Arrays.copyOfRange(a, start, half+1);
        int i = 0; // index in b
        int j = half+1; // index in second half of a
        int k = start; // index in merged a
        while (i < b.length && j <= end )
            if (c.compare(b[i],a[j]) <= 0)
                a[k++] = b[i++];
            else
                a[k++] = a[j++];
        while (i < b.length) a[k++] = b[i++];
    } 
}