package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

    //selectionSort method
    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<list.length-1; i++){//outer for loop
        	int lowestIndex = i;
        	
            for(int j=i+1; j<list.length; j++){//inner for loop
            	if(list[j]<list[lowestIndex]) lowestIndex = j;
            }//inner for loop
            
            if(list[lowestIndex]!=list[i]){//if block
            	int temp = list[i];
                list[i] = list[lowestIndex];
                list[lowestIndex] = temp;
            }//if block inside outer for loop
            
        }//outer for loop

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }//selectionSort method

    //insertionSort method
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int head, j;
        for(int i=1; i<array.length; i++){//for loop
            head = array[i];
            j=i-1;
            
            //while loop
            while(j>=0 && head < array[j]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }//while loop
            
        }//for loop

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }//insertionSort method

    //bubbleSort method
    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for(int repeat=0; repeat<list.length; repeat++){//outer for loop
        	for(int i=0; i<list.length-1; i++){//inner for loop
        		if(list[i]>list[i+1]){
        			int temp = list[i];
        			list[i] = list[i+1];
        			list[i+1] = temp;
        		}
        	}//inner for loop
        }//outer for loop
        
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;        
        return list;
    }//bubbleSort method
    
    //mergeSort Work:
    	//mergeSort method
    	public int [] mergeSort(int [] array){
    		final long startTime = System.currentTimeMillis();
    		int [] list = array;
    		//implement here
        
    		if (list.length <= 1) {
    			return list;
    		}
        
    		// Split the array in half
    		int[] first = new int[list.length / 2];
    		int[] second = new int[list.length - first.length];
    		System.arraycopy(list, 0, first, 0, first.length);
    		System.arraycopy(list, first.length, second, 0, second.length);
        
    		// Sort each half
    		mergeSort(first);
    		mergeSort(second);
        
    		// Merge the halves together, overwriting the original array
    		merge(first, second, list);
        
    		final long endTime = System.currentTimeMillis();
    		final long executionTime = endTime - startTime;
    		this.executionTime = executionTime;        
    		return list;
    	}//mergeSort method
    
    	//merge method
    	private void merge(int[] first, int[] second, int [] result) {
    		int iFirst = 0;
    		int iSecond = 0;
        
    		int j = 0;
    		
    		//while loop
    		while (iFirst < first.length && iSecond < second.length) {
    			if (first[iFirst] < second[iSecond]) {
    				result[j] = first[iFirst];
    				iFirst++;
                }
    			else {
    				result[j] = second[iSecond];
    				iSecond++;
    			}
    			j++;
    		}//while loop
    		System.arraycopy(first, iFirst, result, j, first.length - iFirst);
    		System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    	}//method merge
    //mergeSort work
    
    //quickSort method
    public int [] quickSort(int [] array, int lowerIndex, int higherIndex){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int i = lowerIndex;
        int j = higherIndex;
        
        // calculate pivot number, I am taking pivot as middle index number
        int middleIndex = list[lowerIndex+(higherIndex-lowerIndex)/2];

        // outer while loop
        while (i <= j) {
        	// 1st inner while loop
        	while (array[i] < middleIndex) {
                i++;
            }// 1st inner while loop
        	// 2nd inner while loop
            while (array[j] > middleIndex) {
                j--;
            }// 2nd inner while loop

            if (i <= j) {
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(list, lowerIndex, j);
        if (i < higherIndex)
            quickSort(list, i, higherIndex);
        
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;        
        return list;
    }//quickSort method
    	
    //heapSort Work
    	//heapSort method
    	public int [] heapSort(int [] array){
    		final long startTime = System.currentTimeMillis();
    		int [] list = array;
    		//implement here
    		int n = list.length;
        
    		// Build heap (rearrange array)
    		for (int i = n / 2 - 1; i >= 0; i--){
    			heapify(list, n, i);
    		}
 
    		// One by one extract an element from heap
    		for (int i=n-1; i>=0; i--){
    			int temp = list[0];
    			list[0] = list[i];
    			list[i] = temp;
    			heapify(list, i, 0);
    		}

    		final long endTime = System.currentTimeMillis();
    		final long executionTime = endTime - startTime;
    		this.executionTime = executionTime;        
    		return list;
    	}//heapSort method
    
    	//heapify method
    	private void heapify(int list[], int n, int i){
    		int largest = i;
    		int left = 2*i + 1;
    		int right = 2*i + 2;
 
    		if (left < n && list[left] > list[largest]) largest = left;
    		if (right < n && list[right] > list[largest]) largest = right;
 
    		if (largest != i){
    			int swap = list[i];
    			list[i] = list[largest];
    			list[largest] = swap;
            
    			// Recursively heapify the affected sub-tree
    			heapify(list, n, largest);
    		}
    	}//heapify method
    //heapSort work

    //bucketSort method
    @SuppressWarnings("unchecked")
	public int [] bucketSort(int [] array, int bucketCount){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if (bucketCount <=0 ) return list;
        if (array.length <= 1) return list; //trivially sorted

        int high = list[0];
        int low = list[0];
        for (int i = 1; i < list.length; i++) { //find the range of input elements
            if (list[i] > high) high = list[i];
            if (list[i] < low) low = list[i];
        }
        double interval = ((double)(high - low + 1))/bucketCount; //range of one bucket

        ArrayList<Integer> buckets[] = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) { //initialize buckets
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < list.length; i++) { //partition the input array
            buckets[(int)((array[i] - low)/interval)].add(list[i]);
        }

        int pointer = 0;
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]); //mergeSort
            for (int j = 0; j < buckets[i].size(); j++) { //merge the buckets
                list[pointer] = buckets[i].get(j);
                pointer++;
            }
        }
        
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;        
        return list;
    }//bucketSort method
    
    //shellSort method
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
    	int increment = list.length / 2;
    	while (increment > 0) {
    		for (int i = increment; i < list.length; i++) {
    			int j = i;
    			int temp = list[i];
    			while (j >= increment && list[j - increment] > temp) {
    				list[j] = list[j - increment];
    				j = j - increment;
    			}
    			list[j] = temp;
    		}
    		if (increment == 2) {
    			increment = 1;
    		} else {
    			increment *= (5.0 / 11);
    		}
    	}      
        
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;        
        return list;
    }
//*/shellSort method 
    
    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
