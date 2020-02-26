import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2020
 */
@RunWith(JUnit4.class)

/**		TEST RESULTS (IN NANOSECONDS)
 * 		 		
 *  			  Insert  Selection   quick   Merge1  Merge2  
	10rand      -4600   -  1900     - 1300   - 1200  - 1200
	100rand		-50700  -  44600    - 44400  - 43700 - 44400	
	1000rand	-4339100-  1190300  - 949500 - 838400- 830900
	1000dup  	-2489500-  772300   - 768900 - 769200- 729200
	1000nearly	-1315900-  1007200  - 166100 - 178500- 148200
	1000reverse -3223200-  1579900  - 1049400- 1562000- 236200
	1000sorted  -34800  -  32400    - 29600  - 32500  - 38500
 *  
 *  QA) insertion sort. difference in time for sorted vs unsorted 
 *      for 1000 data set is massive
 *  QB)	Insertion sort as its simplicity causes the time taken to 
 *  	increase significantly with a larger data set 
 *  QC) worst = insertion.....best = merge sort
 *  QD) the recursive version of merge sort was more time effective
 *  QE) From my tests the recursive merge sort is fastest for all inputs
 */
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison(); 
    }
    
    
    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmptyInsertion()
    {
    	double empty[]= {};
    	double expected[] = {};
    	double sorted[] = SortComparison.insertionSort(empty);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    @Test
    public void testEmptySelection()
    {
    	double empty[]= {};
    	double expected[] = {};
    	double sorted[] = SortComparison.selectionSort(empty);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    @Test
    public void testEmptyQuick()
    {
    	double empty[]= {};
    	double expected[] = {};
    	double sorted[] = SortComparison.quickSort(empty);
    	
    	assertArrayEquals(expected, sorted, 0);
    }

    @Test
    public void testEmptyMergeIterative()
    {
    	double empty[]= {};
    	double expected[] = {};
    	double sorted[] = SortComparison.mergeSortIterative(empty);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    // TODO: add more tests here. Each line of code and each 
    // decision in Collinear.java should
    // be executed at least once from at least one test.
    @Test
    public void testInsertion()
    {
    	double test[] = {77.88,10.6,58.1,22.0,55.3,4.7,6.2,35.3,49.8,18.6};
    	double expected[] = {4.7,6.2,10.6,18.6,22.0,35.3,49.8,55.3,58.1,77.88};
    	double sorted[] = SortComparison.insertionSort(test);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    @Test
    public void testSelection()
    {
    	double test[] = {77.88,10.6,58.1,22.0,55.3,4.7,6.2,35.3,49.8,18.6};
    	double expected[] = {4.7,6.2,10.6,18.6,22.0,35.3,49.8,55.3,58.1,77.88};
    	double sorted[] = SortComparison.selectionSort(test);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    @Test
    public void testQuick()
    {
    	double test[] = {77.88,10.6,58.1,22.0,55.3,4.7,6.2,35.3,49.8,18.6};
    	double expected[] = {4.7,6.2,10.6,18.6,22.0,35.3,49.8,55.3,58.1,77.88};
    	double sorted[] = SortComparison.quickSort(test);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    @Test
    public void testMergeIterative()
    {
    	double test[] = {77.88,10.6,58.1,22.0,55.3,4.7,6.2,35.3,49.8,18.6};
    	double expected[] = {4.7,6.2,10.6,18.6,22.0,35.3,49.8,55.3,58.1,77.88};
    	double sorted[] = SortComparison.mergeSortIterative(test);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    @Test
    public void testMergeRecursive()
    {
    	double test[] = {77.88,10.6,58.1,22.0,55.3,4.7,6.2,35.3,49.8,18.6};
    	double expected[] = {4.7,6.2,10.6,18.6,22.0,35.3,49.8,55.3,58.1,77.88};
    	double sorted[] = SortComparison.mergeSortRecursive(test);
    	
    	assertArrayEquals(expected, sorted, 0);
    }
    
    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed 
     *  #to answer the experimental performance questions of
     *   this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}
