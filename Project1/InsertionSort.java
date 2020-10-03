public class InsertionSort <T extends Comparable <? super T>> implements Sorter <T> {

    /**
     * Constructor for objects of class InsertionSort
     */
    public InsertionSort() {}


    public void sort(T[] A) {
      for (int nextPos = 1; nextPos < A.length; nextPos++) {
        insert(A, nextPos); 
      } 

    }
    
   
    private void insert (T[] A, int nextPos) {
        T nextVal = A[nextPos]; 
         
        while (nextPos > 0 && nextVal.compareTo(A[nextPos-1]) < 0) { 
            A[nextPos] = A[nextPos-1]; 
            nextPos--;
        }
        
        A[nextPos] = nextVal; 
    }
}