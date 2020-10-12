
import java.util.*; 
/**
 * Selection sort Implementation 
 *  This program was copied from the Prof. Ge Xia's lecture
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class SelectionSort<T extends Comparable<? super T>> implements Sorter<T> {

    /**
     * Constructor for objects of class SelectionSort
     */
    public SelectionSort() {}

    /**
     * Sort an array of ints using selection sort. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        int n = a.length;
        for (int fill = 0; fill < n-1; fill++) {
            int posMin = fill;
            for (int next = fill+1; next < n; next++)
                if (a[next] < a[posMin]) posMin = next;
            int tmp = a[fill];
            a[fill] = a[posMin];
            a[posMin] = tmp;
        }
    }

    /**
     * Sort an array using selection sort. 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a) {
        int n = a.length;
        for (int fill = 0; fill < n-1; fill++) {
            int posMin = fill;
            for (int nxt = fill+1; nxt < n; nxt++)
                if (a[nxt].compareTo(a[posMin])<0) posMin = nxt;
            T tmp = a[fill];
            a[fill] = a[posMin];
            a[posMin] = tmp;
        }
    }

    /**
     * Sort an array using selection sort. 
     *
     * @param  a  an array of comparable objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c) {
        int n = a.length;
        for (int fill = 0; fill < n-1; fill++) {
            int posMin = fill;
            for (int nxt = fill+1; nxt < n; nxt++)
                if (c.compare(a[nxt], a[posMin])<0) posMin = nxt;
            T tmp = a[fill];
            a[fill] = a[posMin];
            a[posMin] = tmp;
        }
    }

}