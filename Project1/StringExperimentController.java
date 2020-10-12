import java.util.*;
import java.io.*; 
/**
 * Test the sorting algorithm usign String  
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public class StringExperimentController extends ExperimentController<String>
{
    String stringContainer="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
    public  static void main() throws FileNotFoundException {
        Integer[] k = {10};
        Integer[] smallData = {100,200,300,400,500,600,700,800,900};//{100,200,300,400,500,600,700,800,900};//array containing the small elements numbers 
        Integer[] mediumData = {1000,2000,3000,4000,5000,6000,7000,8000,9000}; //array containing the  medium elements numbers 
        Integer[] largeData = {10000,20000,30000,40000,50000};//array containing the large elements numbers 
        ExperimentController exp=new StringExperimentController();
        exp.numberOfElements=largeData; // the curent element numbers 

        /*
         * Uncomment the following program if you want to print the data on the csv file 
        PrintStream out = new PrintStream(new FileOutputStream("MergeDefault.csv"));
        System.setOut(out); 
         */
        //exp.testInsertionSort();
        //exp.testBubbleSort();
        //exp.testMergeSort();
        // exp.testSelectionSort();
        // exp.testQuickSortRandomPivot();
        //  exp.testQuickSortFrontPivot();
        exp.testQuickSortMedianPivot();

        /*
        for (exp.currentNumbers=0; exp.currentNumbers<exp.numberOfElements.length;exp.currentNumbers++){
        exp.generateDuplicateElementsArray();
        exp.printArray();
        }
         */
    }

    /**
     * Test the sorting algorithm usign String  
     */
    public StringExperimentController()
    {

    }

    public String generateRandomString() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int wordlength=3;
        for (int i = 0; i <wordlength ; i++) {
            sb.append(stringContainer.charAt(random.nextInt(stringContainer .length())));

        }

        return sb.toString();
    }

    /**
     * Generate array with random items  
     * 
     */
    public  void generateRandomListArray() {
        Random random = new Random(seeds);
        array=new String[numberOfElements[currentNumbers]];
        for (int i = 0; i < array.length; i++) {
            array[i]=generateRandomString();}
    }

    /**
     * Generate array with sorted items  
     * 
     */
    public  void generateSortedArray() {
        array=new String [numberOfElements[currentNumbers]];
        for (int i = 0; i < array.length; i++) {
            array[i]= generateRandomString();}
        Arrays.sort(array); 

    }    

    /**
     * Generate array with reverse sorted items
     * 
     */
    public  void generateReverseSortedArray() {
        array=new String [numberOfElements[currentNumbers]];
        for (int j = 0; j < array.length; j++) {
            array[j] = generateRandomString(); 
        }
        Arrays.sort(array, Collections.reverseOrder());
    } 

    /**
     * Generate array with partially sorted array 
     * 
     */
    public  void generateHalfSortedArray() {
        Random random = new Random(currentNumbers);
        array=new String[numberOfElements[currentNumbers]];

        for (int j = 0; j < array.length/2; j ++) {

            array[j] = generateRandomString();
        }
        // System.out.println(Arrays.toString(array)); 
        for (int j = array.length/2; j < array.length; j ++) {

            array[j] = "ZZZZZZZZZZZ";
        }
        //System.out.println(Arrays.toString(array));
        Arrays.sort(array); 
        //System.out.println(Arrays.toString(array));
        for (int j = array.length/2; j < array.length; j ++) {

            array[j] = generateRandomString();
        }
    }

    /**
     * Generate array with random items  
     * 
     */
    public  void generateDuplicateElementsArray() {
        Random random = new Random(currentNumbers);
        array=new String[numberOfElements[currentNumbers]];
        int k =0;

        for (int j = 0; j < array.length; j ++) {

            array[j] = generateRandomString() ;
        }
        Arrays.sort(array);
        for (int j = array.length/2; j < array.length-1; j=j+2) {
            array[j] = generateRandomString() ;
            array[j+1] = array[j] ;
        }
    }

}
