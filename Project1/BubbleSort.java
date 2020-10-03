public class BubbleSort<T extends Comparable<? super T>> implements Sorter<T> {
    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort(){}

    public void sort (T[] A) {
        for (int i = 0; i < A.length - 1; i++) {

            for (int j = 0; j < A.length - 1 - i; j++) {

                if (A[j+1].compareTo(A[j]) < 0) { 
                    T tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }

    }
}