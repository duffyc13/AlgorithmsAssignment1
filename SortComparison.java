// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2020
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]) 
    {
    	double length = a.length;
    	for (int i = 0; i < length; i++)
    	{
    		double key = a[i];
    		int j = i-1;
    		
    		while (j >= 0 && a[j] > key)
    		{
    			a[j + 1] = a[j];
    			j = j - 1;
    		}
    		a[j + 1] = key;
    	}
    	return a;
    }//end insertionsort
	
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[])
    {
    	double length = a.length;
    	for (int i = 0; i < length-1; i++)
    	{
    		 int min = i; 
             for (int j = i+1; j < length; j++) 
             {
            	 if (a[j] < a[min]) 
                     min = j;
             }
             
             double tempElement = a[min];
             a[min] = a[i];
             a[i] = tempElement;
    	}
    	
    	return a;
    }//end selectionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */ 
    static double [] quickSort (double a[])
    {		 
    	int len = a.length;
    	sort(a, 0, len - 1);
    	return a;
    }//end quicksort

    static int partition(double a[], int low, int high)
    {
	    double piv = a[high];
	    int i = (low - 1);
	    for(int j = low; j < high; j++)
	    {
	    	if (a[j] < piv)
	    	{
	    		i++;
	    		double temp = a[i];
	    		a[i] = a[j];
	    		a[j] = temp; 
	    	}
	    }
	    double temp = a[i + 1];
	    a[i + 1] = a[high];
	    a[high] = temp;
	    
	    return i + 1;
    }
    
    static void sort (double a[], int low , int high)
    {
    	if (low < high)
    	{
			int pi = partition(a, low, high);
			sort(a, low, pi-1);
			sort(a, pi + 1, high);
    	}
    }
    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) 
    {

		 //todo: implement the sort
    	return a;
    }//end mergesortIterative
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) 
    {
    	

    	//todo: implement the sort
    	return a;
   }//end mergeSortRecursive
    	
    


   


    public static void main(String[] args) 
    {

        //todo: do experiments as per assignment instructions
    }

 }//end class
