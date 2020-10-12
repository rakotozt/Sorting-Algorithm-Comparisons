import java.util.*;
/**
 * Quick Sort with a median Pivot 
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class QuickSortMedianPivot <T extends Comparable <? super T>> extends QuickSorter <T>
{
    /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     */
    private <T extends Comparable<? super T>> T getPivot(T[] A,int low, int high)  {
        BubbleSort b = new BubbleSort(); // Creates a new instance of Bubble Sort

        Comparable[] findMedian = {A[low], A[high], A[(low+high)/2]}; // An array containing the first, last, and middle value of the array 

        b.sort(findMedian); // Bubble sorts the findMedian array to ensure the median value is now the physical middle value of the array

        return (T) findMedian[1];
    }
    /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     */
    private  int getPivot(int[] A,int low, int high)  {
        BubbleSort b = new BubbleSort(); // Creates a new instance of Bubble Sort

        Comparable[] findMedian = {A[low], A[high], A[(low+high)/2]}; // An array containing the first, last, and middle value of the array 

        b.sort(findMedian); // Bubble sorts the findMedian array to ensure the median value is now the physical middle value of the array

        return (int) findMedian[1];
    }
    /**
     * Get the first element as pivot  
     *
     * @param A array
     * @param low lowest index
     * @param high highest index 
     * @param c Comparator 
     */
    private <T> T getPivot(T[] A,int low, int high,Comparator<T> c){
        BubbleSort b = new BubbleSort(); // Creates a new instance of Bubble Sort

        Object[] findMedian = {A[low], A[high], A[(low+high)/2]}; // An array containing the first, last, and middle value of the array 

        b.sort(findMedian,c); // Bubble sorts the findMedian array to ensure the median value is now the physical middle value of the array

        return (T) findMedian[1];
    }
}