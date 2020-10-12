import java.util.*;
/**
 * Quick Sort with Random Pivot 
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class QuickSortRandomPivot <T extends Comparable <? super T>> extends QuickSorter <T>
{
    /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     */
    private <T extends Comparable<? super T>> T getPivot(T[] A,int low, int high) {
        Random rand = new Random();

        return (T) A[rand.nextInt((high - low) + 1) + low];
    }

    /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     */
    private int getPivot(int[] A,int low, int high) {
        Random rand = new Random();

        return (int) A[rand.nextInt((high - low) + 1) + low];
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
        Random rand = new Random();

        return (T) A[rand.nextInt((high - low) + 1) + low];
    }
}
