import java.util.*;
/**
 * Insertion Sort Implementation
 *  This program was copied from the Prof. Ge Xia's lecture
 *   
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class InsertionSort <T extends Comparable <? super T>> implements Sorter <T> {

    /**
     * Constructor for objects of class InsertionSort
     */
    public InsertionSort() {}

    public <T extends Comparable<? super T>> void sort (T[] a) {
        for (int nextPos = 1;
        nextPos < a.length;
        nextPos++) {
            insert(a, nextPos);
        }
    }

    /**
     * Implements insertion sort comparison 
     */
    private static <T extends Comparable<? super T>> void insert (T[] a, int nextPos) {
        T nextVal = a[nextPos];
        while
        (nextPos > 0 &&
        nextVal.compareTo(a[nextPos-1]) < 0){
            a[nextPos] = a[nextPos-1];
            nextPos--;
        }
        a[nextPos]=  nextVal;}

    public  void sort (int[] a) {
        for (int nextPos = 1;
        nextPos < a.length;
        nextPos++) {
            insert(a, nextPos);
        }
    }      

    private static <T extends Comparable<? super T>> void insert (int[] a, int nextPos) {
        int nextVal = a[nextPos];
        while
        (nextPos > 0 &&
        nextVal<a[nextPos-1] ){
            a[nextPos] = a[nextPos-1];
            nextPos--;
        }
        a[nextPos]=  nextVal;}

    /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c){
        for (int nextPos = 1;
        nextPos < a.length;
        nextPos++) {
            insert(a, nextPos,c);

        }

    }

    public <T> void insert (T[] a, int nextPos, Comparator<T> c) {
        T nextVal = a[nextPos];
        while
        (nextPos > 0 &&
        c.compare(nextVal,a[nextPos-1]) < 0){
            a[nextPos] = a[nextPos-1];
            nextPos--;
        }
        a[nextPos]=  nextVal;}

}
