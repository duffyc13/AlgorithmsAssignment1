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
