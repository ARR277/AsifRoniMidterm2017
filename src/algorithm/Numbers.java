package algorithm;
import algorithm.Sort;
import java.util.Random;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		
		int [] num1 = new int[10000];
		int [] num2 = new int[10000];
		int [] num3 = new int[10000];
		int [] num4 = new int[10000];
		int [] num5 = new int[10000];
		int [] num6 = new int[10000];
		int [] num7 = new int[10000];
		int [] num8 = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num1.length; i++){
			
			num1[i] = rand.nextInt(1000000);
			num2[i] = rand.nextInt(1000000);
			num3[i] = rand.nextInt(1000000);
			num4[i] = rand.nextInt(1000000);
			num5[i] = rand.nextInt(1000000);
			num6[i] = rand.nextInt(1000000);
			num7[i] = rand.nextInt(1000000);
			num8[i] = rand.nextInt(1000000);
			
		}

		
		//Selection Sort
		Sort algo = new Sort();

/*
		int [] test = {12, 23, 34, 87, 32, 10, 43, 89, 6, 13};
		algo.bubbleSort(test);
		algo.printSortedArray(test);

//*/
///*	
		// 1. Selection Sort
		algo.selectionSort(num1);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num1.length
				+ " numbers in \"Selection\" Sort take: " + selectionSortExecutionTime
				+ " milli sec");

		// 2. Insertion Sort
		algo.insertionSort(num2);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num2.length
				+ " numbers in \"Insertion\" Sort take: " + insertionSortExecutionTime
				+ " milli sec");

		//Continue for rest of the Sorting Algorithm....

		// 3. Bubble Sort
		algo.insertionSort(num3);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num3.length
				+ " numbers in   \"Bubble\"  Sort take: " + bubbleSortExecutionTime
				+ " milli sec");
		
		// 4. Merge Sort
		algo.mergeSort(num4);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num4.length
				+ " numbers in   \"Merge\"   Sort take: " + mergeSortExecutionTime
				+ " milli sec");
		
		// 5. Quick Sort
		algo.quickSort(num5, 0, num5.length-1);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num5.length
				+ " numbers in   \"Quick\"   Sort take: " + quickSortExecutionTime
				+ " milli sec");
		
		// 6. Heap Sort
		algo.heapSort(num6);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num6.length
				+ " numbers in   \"Heap\"    Sort take: " + heapSortExecutionTime
				+ " milli sec");

		// 7. Bucket Sort
		algo.bucketSort(num7, 50);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num7.length
				+ " numbers in   \"Bucket\"  Sort take: " + bucketSortExecutionTime
				+ " milli sec");

		// 8. Shell Sort
		algo.shellSort(num8);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num7.length
				+ " numbers in   \"Shell\"   Sort take: " + shellSortExecutionTime
				+ " milli sec");

//*/

	}

}
