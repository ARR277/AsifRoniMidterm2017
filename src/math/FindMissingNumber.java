package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 6, 12};
         System.out.print("Original Array: ");
         for(int print: array){
        	 System.out.print(" "+print);
         }
         array = selectionSortArray(array);
         System.out.print("\nSort Array: ");
         for(int printSort: array){
        	 System.out.print(" "+printSort);
         }         
         findingListOfMissingNumber(array);
    }

	private static void findingListOfMissingNumber(int[] n) {
		// TODO Auto-generated method stub
		boolean isMissing = false;
		String missingNum = "";
		for(int i=0; i<n.length-1;i++){
			if( (n[i]+1)==n[i+1] )continue;
			else{
				for(int j=n[i]+1; j<n[i+1]; j++){
					missingNum += (" "+j);
				}
				isMissing = true;
			}
		}
		if(isMissing) System.out.println("\nThere is missing number from the list:"+missingNum);
		else System.out.println("\nThere is no missing number from the list.");
	}

	private static int[] selectionSortArray(int[] array) {
		// TODO Auto-generated method stub
        for(int i=0; i<array.length-1; i++){//outer for loop
        	int lowestIndex = i;
        	
            for(int j=i+1; j<array.length; j++){//inner for loop
            	if(array[j]<array[lowestIndex]) lowestIndex = j;
            }//inner for loop
            
            if(array[lowestIndex]!=array[i]){//if block
            	int temp = array[i];
                array[i] = array[lowestIndex];
                array[lowestIndex] = temp;
            }//if block inside outer for loop
            
        }//outer for loop
		
		return array;
	}
}
