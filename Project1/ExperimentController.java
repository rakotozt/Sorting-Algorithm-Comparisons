import java.util.*; 
import java.io.*; 
/**
 * 
 *
 * @author Tafita Rakotozandry 
 * @version1
 */
public class ExperimentController
{

    private static Integer [] array; // the array the will contain all the data 

    public static Integer[] numberOfElements; //the container of the different number of elements
    public static  Integer currentNumbers; //the actual type of array used 
    private static Integer min=0; //minimum number generated 
    private static Integer max=100000; //maximum number generated
    private static Integer seeds=56153333; //the seeds of the random 

    public static void main() throws FileNotFoundException {
        Integer[] k = {10};
        Integer[] smallData = {100,200,300,400,500,600,700,800,900};//{100,200,300,400,500,600,700,800,900};//array containing the small elements numbers 
        Integer[] mediumData = {1000,2000,3000,4000,5000,6000,7000,8000,9000}; //array containing the  medium elements numbers 
        Integer[] largeData = {10000,20000,30000,40000,50000,60000,70000,80000,90000};//array containing the large elements numbers 
        numberOfElements=largeData; // the curent element numbers 
        PrintStream out = new PrintStream(new FileOutputStream("QuickSortMedianPivotLargeDataMeasurement.csv"));
        System.setOut(out); 
        //testInsertionSort();
        // testBubbleSort();
        //testMergeSort();
        //testSelectionSort();
        //testQuickSortRandomPivot();
        //testQuickSortFrontPivot();
         testQuickSortMedianPivot();

    }

    /**
     * Print The arrays 
     */
    public static void printArray() {
        System.out.println(Arrays.toString(array)); 
    }

    /**
     * Print Data into a csv file 
     * use only when to export data into file 
     * 
     */
    public static void writeCSV()throws FileNotFoundException{
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out); 
    }

    /**
     * Runs tests on insertion sort with different array charactaristics 
     * 
     */
    public static void testInsertionSort() {
        System.out.println("ReverseSorted Array For InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("Sorted Array For InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("RandomListArray InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("HalfSortedArray InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("DuplicateElementsArray InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  

    }   

    /**
     * Runs tests on Bubble sort with different array charactaristics 
     * 
     */
    public static void testBubbleSort() {
        System.out.println("ReverseSorted Array For BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("Sorted Array For BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("RandomListArray BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("HalfSortedArray BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("DuplicateElementsArray BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  

    } 

    /**
     * Runs tests on Merge sort with different array charactaristics 
     * 
     */
    public static void testMergeSort() {
        System.out.println("ReverseSorted Array For MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("Sorted Array For MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("RandomListArray MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("HalfSortedArray MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("DuplicateElementsArray MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  

    } 

    /**
     * Runs tests on Selection sort with different array charactaristics 
     * 
     */
    public static void testSelectionSort() {
        System.out.println("ReverseSorted Array For SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("Sorted Array For SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("RandomListArray SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("HalfSortedArray SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("DuplicateElementsArray SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  

    } 

    /**
     * Runs tests on QuickSortRandomPivot sort with different array charactaristics 
     * 
     */
    public static void testQuickSortRandomPivot() {
        System.out.println("ReverseSorted Array For QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("Sorted Array For QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("RandomListArray QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("HalfSortedArray QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("DuplicateElementsArray QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  

    } 

    /**
     * Runs tests on QuickSortFrontPivot sort with different array charactaristics 
     * 
     */
    public static void testQuickSortFrontPivot() {
        System.out.println("ReverseSorted Array For QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("Sorted Array For QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("RandomListArray QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("HalfSortedArray QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("DuplicateElementsArray QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  

    } 

    /**
     * Runs tests on QuickSortMedianPivot sort with different array charactaristics 
     * 
     */
    public static void testQuickSortMedianPivot() {
        System.out.println("ReverseSorted Array For QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("Sorted Array For QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("RandomListArray QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("HalfSortedArray QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("DuplicateElementsArray QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        
    }       

    /**
     * Generate array with random items  
     * 
     */
    public static void generateRandomListArray() {
        Random random = new Random(seeds);
        array=new Integer[numberOfElements[currentNumbers]];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(max - min) + min; }
    }

    /**
     * Generate array with sorted items  
     * 
     */
    public static void generateSortedArray() {
        array=new Integer [numberOfElements[currentNumbers]];
        for (int i = 0; i < array.length; i++) {
            array[i]= i;}

    }    

    /**
     * Generate array with reverse sorted items
     * 
     */
    public static void generateReverseSortedArray() {
        array=new Integer [numberOfElements[currentNumbers]];
        for (int j = 0; j < array.length; j++) {
            array[j] = array.length - 1 - j; 
        }
    } 

    /**
     * Generate array with partially sorted array 
     * 
     */
    public static void generateHalfSortedArray() {
        Random random = new Random(currentNumbers);
        array=new Integer[numberOfElements[currentNumbers]];

        for (int j = 0; j < array.length/2; j ++) {

            array[j] = j;
        }
        for (int j = array.length/2; j < array.length; j ++) {

            array[j] = random.nextInt((max - (array.length/2)) + 1) + (array.length/2);
        }
    } 

    /**
     * Generate array with random items  
     * 
     */
    public static void generateDuplicateElementsArray() {
        Random random = new Random(currentNumbers);
        array=new Integer[numberOfElements[currentNumbers]];
        int k =0;

        for (int j = 0; j < array.length/2; j ++) {

            array[j] = j;
        }
        for (int j = array.length/2; j < array.length; j ++) {
            k++;
            array[j] = random.nextInt((max - (array.length/2)) + 1) + (array.length/2);
            if(k%2 ==0){
                array[j]=array[j-1];
            }
        }
    }

    /**
     * Returns time to quick sort an array using a random number as pivot 
     *
     */
    public static long timeQuickSortRandomPivot() {
        QuickSortRandomPivot quickSortRandom = new QuickSortRandomPivot();//create the quicksort object 
        long startTime = System.currentTimeMillis(); //take initial time 
        quickSortRandom.sort(array);// run the sorting 
        long  stopTime = System.currentTimeMillis(); //take final time 
        return stopTime - startTime; //return the time 
    }

    /**
     * Returns time to quick sort an array using a front number as pivot 
     *
     */
    public static long timeQuickSortFrontPivot() {
        QuickSortFrontPivot quickSortRandom = new QuickSortFrontPivot();//create the quicksort object 
        long startTime = System.currentTimeMillis(); //take initial time 
        quickSortRandom.sort(array);// run the sorting 
        long  stopTime = System.currentTimeMillis(); //take final time 
        return stopTime - startTime; //return the time 
    }

    /**
     * Returns time to quick sort an array using a front median as pivot 
     *
     */
    public static long timeQuickSortMedianPivot() {
        QuickSortMedianPivot quickSortRandom = new QuickSortMedianPivot();//create the quicksort object 
        long startTime = System.currentTimeMillis(); //take initial time 
        quickSortRandom.sort(array);// run the sorting 
        long  stopTime = System.currentTimeMillis(); //take final time 
        return stopTime - startTime; //return the time difference
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public static long timeMergeSort() {
        MergeSort mergeSort = new MergeSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        mergeSort.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public static  long timeSelectionSort() {
        SelectionSort selection = new SelectionSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        selection.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public static long timeInsertionSort() {
        InsertionSort insertion = new InsertionSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        insertion.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public static long timeBubbleSort() {
        BubbleSort bubble = new BubbleSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        bubble.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }
}
