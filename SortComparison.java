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
    	quickSortRecursive(a, 0, len - 1);
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
    
    static void quickSortRecursive (double a[], int low , int high)
    {
    	if (low < high)
    	{
			int pi = partition(a, low, high);
			quickSortRecursive(a, low, pi-1);
			quickSortRecursive(a, pi + 1, high);
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
		int n = a.length;
		
		for (int current = 1; current <= n-1; current = 2*current)
		{
            for (int left = 0; left < n-1; 
                        left += 2*current) 
            { 
                int mid = Math.min(left + current - 1, n-1); 
          
                int right_end = Math.min(left + 2*current - 1, n-1); 

                merge(a, left, mid, right_end);
            }
		}
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
    	
    	return a;
    
    }//end mergeSortRecursive
    
    static void mergeSort (double a[], int left, int right)
    {
    	if (left < right) 
        { 
            int m = (left+right)/2; 

            mergeSort(a, left, m); 
            mergeSort(a , m+1, right); 
 
            merge(a, left, m, right); 
        } 
    }
    
    static void merge (double a[], int l, int m, int r) 
    {
    	int i, j, k; 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        double L[] = new double[n1]; 
        double R[] = new double[n2]; 
     
        for (i = 0; i < n1; i++) 
            L[i] = a[l + i]; 
        for (j = 0; j < n2; j++) 
            R[j] = a[m + 1+ j]; 
      
        i = 0; 
        j = 0; 
        k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                a[k] = L[i]; 
                i++; 
            } 
            else
            { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 
      
        while (j < n2) 
        { 
            a[k] = R[j]; 
            j++; 
            k++; 
        } 
    }

    public static void main(String[] args) 
    {

        //todo: do experiments as per assignment instructions
    }

 }//end class
