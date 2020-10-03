import java.util.*;
/**
 * Write a description of class QuickSortMedianPivot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSortRandomPivot <T extends Comparable <? super T>> extends QuickSorter <T>
{
    private T getPivot(T[] A,int low, int high) {
            Random rand = new Random();
         
        return (T) A[rand.nextInt((high - low) + 1) + low];
    }
}
