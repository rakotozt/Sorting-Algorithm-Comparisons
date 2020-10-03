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
    private static Integer max=5000; //maximum number generated
    private static Integer seeds=56153333; //the seeds of the random 

    public static void main()  {
        Integer[] k = {10};
        Integer[] smallData = {100,200,300,400,500,600,700,800,900};//array containing the small elements numbers 
        Integer[] mediumData = {1000,2000,3000,4000,5000,6000,7000,8000,9000};//array containing the  medium elements numbers 
        Integer[] largeData = {10000,20000,30000,40000,50000,60000,70000,80000,90000}; //array containing the large elements numbers 
        numberOfElements=largeData; // the curent element numbers 

        testQuickSortMediamPivot();
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
        PrintStream out = new PrintStream(new FileOutputStream("output.csv"));
        System.setOut(out); 
    }

    /**
     * Run a test on front sort using different sorting algorithm 
     * 
     */
    public static void testQuickSortMediamPivot() {

        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            // generateSortedArray();
            // System.out.println("Array Size: "+array.length); 
            // System.out.println("Sorted Array: "+timeBubbleSort()); 
            //printArray(); 
            generateReverseSortedArray(); 
            System.out.println("Array Size,"+array.length+","+timeInsertionSort());
            //generateRandomListArray(); 
            //System.out.println("Random Array: "+timeQuickSortMedianPivot()); 
            //generatePartiallySortedArray(); 
            //System.out.println("Partially Sorted Array: "+timeQuickSortFrontPivot()); 

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
    public static void generatePartiallySortedArray() {
        Random random = new Random(currentNumbers);
        array=new Integer[numberOfElements[currentNumbers]];

        for (int j = 0; j < array.length; j = j + 2) {

            array[j] = random.nextInt((max - min) + 1) + min; // Assigns the index a value in the range
            array[j+1] = array[j]+1;
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
