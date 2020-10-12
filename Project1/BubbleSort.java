import java.util.*;
/**
 * BubbleSort Implementation 
 *  This program was copied from the Prof. Ge Xia's lecture
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class BubbleSort<T extends Comparable<? super T>> implements Sorter<T> {
    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort(){}

    /**
     * Sort an array of ints using bubble sort. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        int n = a.length;
        for (int i = 0; i< n - 1; i++) {
            for (int j = 0; j < n -1 - i; j++) {
                if (a[j+1] < a[j]) 
                {
                    int tmp = a[j]; 
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    /**
     * Sort an array of comparable objects using bubble sort. 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a) {
        int n = a.length;
        for (int i = 0; i< n - 1; i++) {
            for (int j = 0; j < n -1 - i; j++) {
                if (a[j+1].compareTo(a[j]) < 0) 
                {
                    T tmp = a[j]; 
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    /**
     * Sort an array of objects using bubble sort. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c) {
        int n = a.length;
        for (int i = 0; i< n - 1; i++) {
            for (int j = 0; j < n -1 - i; j++) {
                if (c.compare(a[j+1], a[j]) < 0) 
                {
                    T tmp = a[j]; 
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

}