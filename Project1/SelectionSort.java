


import java.util.*; 
public class SelectionSort<T extends Comparable<? super T>> implements Sorter<T> {

    /**
     * Constructor for objects of class SelectionSort
     */
    public SelectionSort() {}


    public void sort (T[] A) {
        int n = A.length;

        for (int fill = 0; fill < n-1; fill++) { 

            int posMin = fill;  

            for (int nxt = fill +1 ; nxt < n; nxt++) {

                if (A[nxt].compareTo(A[posMin]) < 0) { 
                    posMin = nxt; 
                }
            } 
            
            T tmp = A[fill];
            A[fill] = A[posMin];
            A[posMin] = tmp;
        }

    }
}