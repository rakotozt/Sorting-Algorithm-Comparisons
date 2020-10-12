import java.util.*;
import java.io.*; 
/**
 * Test the sorting algorithm usign int (primitive type) 
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class intExperimentController 
{
    private int array[]; // the array the will contain all the data 

    public  Integer[] numberOfElements; //the container of the different number of elements
    public   Integer currentNumbers; //the actual type of array used 
    public  Integer min=0; //minimum number generated 
    public  Integer max=1000000; //maximum number generated
    public  Integer seeds=56153333; //the seeds of the random 
    public  static void main() throws FileNotFoundException {
        Integer[] testArraySize = {10};// it is a test array size 
        Integer[] smallData = {100,200,300,400,500,600,700,800,900};//array containing the small elements numbers 
        Integer[] mediumData = {1000,2000,3000,4000,5000,6000,7000,8000,9000}; //array containing the  medium elements numbers 
        Integer[] largeData = {10000,20000,30000,40000,50000,60000,70000,80000,90000};//array containing the large elements numbers 
        Integer[] XLargeData = {100000,200000,300000,400000,500000,600000,700000,800000,900000};//array containing the large elements numbers 
        intExperimentController exp=new intExperimentController();
        exp.numberOfElements=largeData; // the curent element numbers
        /*
         * Uncomment the following program if you want to print the data on the csv file  
        PrintStream out = new PrintStream(new FileOutputStream("MergeDefault.csv"));
        System.setOut(out); 
         */

        //uncomment the following if you would like to make a specific measurement 
        //exp.testInsertionSort();
        // exp.testBubbleSort();
        // exp.testMergeSort();
        //exp.testSelectionSort();
        //exp.testQuickSortRandomPivot();
        // exp.testQuickSortFrontPivot();
        //exp.testQuickSortMedianPivot();
        // exp.testJavaDefaultQuickSort(); 
        exp.testJavaDefaultMergeSort();

        /*
         * //uncomment this to visualuze how the data is generated 

        for (exp.currentNumbers=0; exp.currentNumbers<exp.numberOfElements.length;exp.currentNumbers++){
        exp.generateDuplicateElementsArray() ;
        exp.printArray();
        }
         */

    }

    /**
     * Constructor for objects of class IntegerExperiment
     */
    public intExperimentController()
    {

    }

    /**
     * Print The arrays 
     */
    public  void printArray() {
        System.out.println(Arrays.toString(array)); 
    }

    /**
     * Print Data into a csv file 
     * use only when to export data into file 
     * 
     */
    public  void writeCSV()throws FileNotFoundException{
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out); 
    }

    /**
     * Runs tests on insertion sort with different array charactaristics 
     * 
     */
    public  void testInsertionSort() {
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
    public  void testBubbleSort() {
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
    public  void testMergeSort() {
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
    public  void testSelectionSort() {
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
    public  void testQuickSortRandomPivot() {
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
    public  void testQuickSortFrontPivot() {
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
    public  void testQuickSortMedianPivot() {
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
     * Returns time to quick sort an array using a random number as pivot 
     *
     */
    public  long timeQuickSortRandomPivot() {
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
    public  long timeQuickSortFrontPivot() {
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
    public  long timeQuickSortMedianPivot() {
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
    public  long timeMergeSort() {
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
    public   long timeSelectionSort() {
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
    public  long timeInsertionSort() {
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
    public  long timeBubbleSort() {
        BubbleSort bubble = new BubbleSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        bubble.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }

    /**
     * Generate array with random items  
     * 
     */
    public  void generateRandomListArray() {
        Random random = new Random(seeds);
        array= new int[numberOfElements[currentNumbers]];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(max - min) + min; }
    }

    /**
     * Generate array with sorted items  
     * 
     */
    public  void generateSortedArray() {
        array=new int[numberOfElements[currentNumbers]];
        for (int i = 0; i < array.length; i++) {
            array[i]= i;}

    }    

    /**
     * Generate array with reverse sorted items
     * 
     */
    public  void generateReverseSortedArray() {
        array=new int[numberOfElements[currentNumbers]];
        for (int j = 0; j < array.length; j++) {
            array[j] = array.length - 1 - j; 
        }
    } 

    /**
     * Generate array with partially sorted array 
     * 
     */
    public  void generateHalfSortedArray() {
        Random random = new Random(currentNumbers);
        array=new int [numberOfElements[currentNumbers]];

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
    public  void generateDuplicateElementsArray() {
        Random random = new Random(currentNumbers);
        array=new int[numberOfElements[currentNumbers]];
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
     * Return time from Java's defaultMergeSort 
     */
    public  long timeJavaDefaultMergeSort() {
        long startTime = System.currentTimeMillis(); 
        Arrays.sort(array); 
        long stopTime = System.currentTimeMillis(); 
        return stopTime - startTime; 
    }

    /**
     * Return time from Java's defaul quick sort 
     */
    public  long timeJavaDefaultQuickSort() {
        int [] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = (int) array[i]; // Casts the array to type int to ensure Java calls QuickSort
        }
        long startTime = System.currentTimeMillis(); 
        Arrays.sort(array2);
        long stopTime = System.currentTimeMillis(); 
        return stopTime - startTime;       
    }

    /**
     * Runs tests on Java Default QuickSort with different array charactaristics 
     * 
     */
    public  void testJavaDefaultMergeSort() {
        System.out.println("ReverseSorted Array For JavaDefaultMergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultMergeSort());
        }  
        System.out.println("Sorted Array For JavaDefaultMergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultMergeSort());
        }  
        System.out.println("RandomListArray JavaDefaultMergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultMergeSort());
        }  
        System.out.println("HalfSortedArray JavaDefaultMergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultMergeSort());
        }  
        System.out.println("DuplicateElementsArray JavaDefaultMergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultMergeSort());
        }  

    } 

    /**
     * Runs tests on Java Default QuickSort with different array charactaristics 
     * 
     */
    public  void testJavaDefaultQuickSort() {
        System.out.println("ReverseSorted Array For JavaDefaultQuickSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultQuickSort());
        }  
        System.out.println("Sorted Array For JavaDefaultQuickSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultQuickSort());
        }  
        System.out.println("RandomListArray JavaDefaultQuickSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultQuickSort());
        }  
        System.out.println("HalfSortedArray JavaDefaultQuickSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultQuickSort());
        }  
        System.out.println("DuplicateElementsArray JavaDefaultQuickSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeJavaDefaultQuickSort());
        }  

    } 

}
