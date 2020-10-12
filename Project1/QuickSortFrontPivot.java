import java.util.Arrays;
import java.util.Random;
import java.util.*;
/**
 * Quick sort with first element Pivot 
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class  QuickSortFrontPivot <T extends Comparable <? super T>> extends QuickSorter <T> {

    /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     */
    private <T extends Comparable<? super T>> T getPivot(T[] A,int low, int high) {

        return (T) A[0];
    }

        /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     */
    private  int getPivot(int[] A,int low, int high) {

        return (int) A[0];
    }
    /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     * @param c Comparator 
     */
    private <T> T getPivot(T[] A,int low, int high,Comparator<T> c) {
        return (T) A[0];
    }
}