import java.util.*; 
/**
 * Quick Sort Interface  
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public abstract class QuickSorter <T extends Comparable <? super T>> implements Sorter <T> {
/**
     * Calls qSort() on the array passed as an argument. Starts the recursive sorting process.
     * 
     * @param y T[]
     */
    public <T extends Comparable<? super T>> void sort (T[] a) {
        qSort(a, 0, a.length-1); // Calls qSort on the array y from the first to last element

    }

    
        /**
     * Sort an array of ints. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a){qSort(a, 0, a.length-1); // Calls qSort on the array y from the first to last element
}

       /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c){qSort(a, 0, a.length-1,c);}
 
    
    
    
    
    
    
    /**
     * Continues to recursively sort each smaller array as the original array gets smaller
     * 
     * @param a T[]
     * @param low int
     * @param high int
     */ 
    private  <T extends Comparable<? super T>> void qSort (T[] a, int low, int high) {
        if (low < high) { // Checks if the first element being checked comes before the last element being checked
            int pivIndex = partition(a, low, high); // Stores the value returned by the partition method

            qSort(a, low, pivIndex); // Recursively sorts the first half of the array
            qSort(a, pivIndex + 1, high); // Recursively sorts the second half of the array
        }
    }


    /**
     * Assigns the pivot value of the array being and returns the value partitioned at
     * 
     * @param a T[]
     * @param low int
     * @param high int
     */
    public <T extends Comparable<? super T>> int partition (T[] A, int low, int high) {
        T pivot = getPivot(A,low,high); // Assigns the middle value of the findMedian array as the pivot value

        int u = low;
        int d = high;

        while (true) { // Replaces the do while loop as this prevents the Stack Overflow from showing up

            while ((pivot.compareTo(A[u]) > 0)) {
                u++; // Keeps moving u up the array as long as a value bigger than pivot does not show up
            }

            while (pivot.compareTo(A[d]) < 0) {
                d--; // Keeps moving d down the array as long as a value smaller than the pivot does not show up
            }

            if (d <= u) { // Checks if u and d have not crossed each other 
                return d; // Returns the partition value at the time
            }

            swap(A, u, d); // Swaps the values of u and d if a change needs to be done

            u++; // Keeps incrementing u
            d--; // Keeps decrementing d
        }
    }

    /**
     * Accepts an array and two values. Swaps them in the array.
     * 
     * @param a T[]
     * @param x int
     * @param y int
     */
    private <T extends Comparable<? super T>> void swap(T[] a, int x, int y) { 
        T tmp = a[x]; // Temporarily stores the first value
        a[x] = a[y]; // Assigns the second value in place of the first value
        a[y] = tmp; // Assigns the second the temporarily stored first value
    } 

    // /**
     // * This is a copy of the method above to be used by the unit tests.
     // * Returns the array after the swap so the unit test can see if it was correct.
     // */
    // public T[] swapReturn (T[] a, int x, int y) { 
        // T tmp = a[x]; 
        // a[x] = a[y]; 
        // a[y] = tmp;

        // return a;
    // }

    private <T extends Comparable<? super T>>  T getPivot(T[] A,int low, int high) {
        BubbleSort b = new BubbleSort(); // Creates a new instance of Bubble Sort

        Comparable[] findMedian = {A[low], A[high], A[(low+high)/2]}; // An array containing the first, last, and middle value of the array 

        b.sort(findMedian); // Bubble sorts the findMedian array to ensure the median value is now the physical middle value of the array

        return (T) findMedian[1];
    }

    
    
    
    
    /**
     * Continues to recursively sort each smaller array as the original array gets smaller
     * 
     * @param a T[]
     * @param low int
     * @param high int
     */ 
    private  void qSort (int[] a, int low, int high) {
        if (low < high) { // Checks if the first element being checked comes before the last element being checked
            int pivIndex = partition(a, low, high); // Stores the value returned by the partition method

            qSort(a, low, pivIndex); // Recursively sorts the first half of the array
            qSort(a, pivIndex + 1, high); // Recursively sorts the second half of the array
        }
    }


    /**
     * Assigns the pivot value of the array being and returns the value partitioned at
     * 
     * @param a T[]
     * @param low int
     * @param high int
     */
    public  int partition (int[] A, int low, int high) {
        int pivot = getPivot(A,low,high); // Assigns the middle value of the findMedian array as the pivot value

        int u = low;
        int d = high;

        while (true) { // Replaces the do while loop as this prevents the Stack Overflow from showing up

            while ((pivot>A[u])) {
                u++; // Keeps moving u up the array as long as a value bigger than pivot does not show up
            }

            while (pivot<A[d]) {
                d--; // Keeps moving d down the array as long as a value smaller than the pivot does not show up
            }

            if (d <= u) { // Checks if u and d have not crossed each other 
                return d; // Returns the partition value at the time
            }

            swap(A, u, d); // Swaps the values of u and d if a change needs to be done

            u++; // Keeps incrementing u
            d--; // Keeps decrementing d
        }
    }

    /**
     * Accepts an array and two values. Swaps them in the array.
     * 
     * @param a T[]
     * @param x int
     * @param y int
     */
    private  void swap(int[] a, int x, int y) { 
        int tmp = a[x]; // Temporarily stores the first value
        a[x] = a[y]; // Assigns the second value in place of the first value
        a[y] = tmp; // Assigns the second the temporarily stored first value
    } 

    // /**
     // * This is a copy of the method above to be used by the unit tests.
     // * Returns the array after the swap so the unit test can see if it was correct.
     // */
    // public T[] swapReturn (T[] a, int x, int y) { 
        // T tmp = a[x]; 
        // a[x] = a[y]; 
        // a[y] = tmp;

        // return a;
    // }

    private  int getPivot(int[] A,int low, int high) {
        BubbleSort b = new BubbleSort(); // Creates a new instance of Bubble Sort

        Comparable[] findMedian = {A[low], A[high], A[(low+high)/2]}; // An array containing the first, last, and middle value of the array 

        b.sort(findMedian); // Bubble sorts the findMedian array to ensure the median value is now the physical middle value of the array

        return (int) findMedian[1];
    }
    
    
    /**
     * Continues to recursively sort each smaller array as the original array gets smaller
     * 
     * @param a T[]
     * @param low int
     * @param high int
     */ 
    private  <T> void qSort (T[] a, int low, int high, Comparator<T> c) {
        if (low < high) { // Checks if the first element being checked comes before the last element being checked
            int pivIndex = partition(a, low, high,c); // Stores the value returned by the partition method

            qSort(a, low, pivIndex,c); // Recursively sorts the first half of the array
            qSort(a, pivIndex + 1, high,c); // Recursively sorts the second half of the array
        }
    }


    /**
     * Assigns the pivot value of the array being and returns the value partitioned at
     * 
     * @param a T[]
     * @param low int
     * @param high int
     */
    public <T> int partition (T[] A, int low, int high,Comparator<T> c) {
        T pivot = getPivot(A,low,high,c); // Assigns the middle value of the findMedian array as the pivot value

        int u = low;
        int d = high;

        while (true) { // Replaces the do while loop as this prevents the Stack Overflow from showing up

            while ((c.compare(pivot,A[u]) > 0)) {
                u++; // Keeps moving u up the array as long as a value bigger than pivot does not show up
            }

            while (c.compare(pivot,A[d]) < 0) {
                d--; // Keeps moving d down the array as long as a value smaller than the pivot does not show up
            }

            if (d <= u) { // Checks if u and d have not crossed each other 
                return d; // Returns the partition value at the time
            }

            swap(A, u, d); // Swaps the values of u and d if a change needs to be done

            u++; // Keeps incrementing u
            d--; // Keeps decrementing d
        }
    }

    /**
     * Accepts an array and two values. Swaps them in the array.
     * 
     * @param a T[]
     * @param x int
     * @param y int
     */
    private <T> void swap(T[] a, int x, int y) { 
        T tmp = a[x]; // Temporarily stores the first value
        a[x] = a[y]; // Assigns the second value in place of the first value
        a[y] = tmp; // Assigns the second the temporarily stored first value
    } 

    // /**
     // * This is a copy of the method above to be used by the unit tests.
     // * Returns the array after the swap so the unit test can see if it was correct.
     // */
    // public T[] swapReturn (T[] a, int x, int y) { 
        // T tmp = a[x]; 
        // a[x] = a[y]; 
        // a[y] = tmp;

        // return a;
    // }

    private <T>  T getPivot(T[] A,int low, int high,Comparator<T> c) {
        BubbleSort b = new BubbleSort(); // Creates a new instance of Bubble Sort

        Object [] findMedian = {A[low], A[high], A[(low+high)/2]}; // An array containing the first, last, and middle value of the array 

        b.sort(findMedian,c); // Bubble sorts the findMedian array to ensure the median value is now the physical middle value of the array

        return (T) findMedian[1];
    }
    
    
}