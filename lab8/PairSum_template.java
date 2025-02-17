/* PairSum.java
   CSC 225 - Summer 2016

   Template for the PairSum225 problem, which takes an array A and returns
	- true if there are two elements of A which add to 225
	- false otherwise

*/

import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;
import java.io.File;

public class PairSum_template {

	/* PairSum225()
	The input array A will contain non-negative integers. The function
	will search the array A for a pair of elements which sum to 225.
	If such a pair is found, return true. Otherwise, return false.
	The function may modify the array A.
	Do not change the function signature (name/parameters).
	*/

	public static boolean PairSum225(int[] A){

		/* Your code here */
		int l = 0;
		int r = A.size()-1;
		MergeSort(A, l, r);

		if (A[l]+A[r] > 225) {
			l = l-1;
		} elif (A[l]+A[r] < 225) {
			r = r+1;
		} elif (A[l]+A[r] == 225) {
			return true;
		}
		return false;
	}


	/*  MergeSort()
	 *  MergeSort function will sort the numbers in array A with index from le to ri.
	 *  The time complexity of this function is O(nlogn).
	 */
	public static void MergeSort(int[] A, int le, int ri){
		/* Your code here */

		int m = (a.size()/2);

		if (le < ri) {
			int[] S = new int[1];
			S[0] = A[le];

			int m = (le+ri)/2;
			MergeSort(A, le, m);
			MergeSort(A, m+1, ri);

			merge(A, le, ri);
		}
		
	}

	/*  Merge()
	 *  Merge() function merges two sorted sub-arrays to a sorted unit. The two
	 *  sub-arrays are numbers of A with index from le to mid, and from mid+1 to
	 *  ri respectively.
	 */
	public static void Merge(int[] A, int le, int mid, int ri){
		/* Your code here */
		
		// create temp arrays
		
		int[] left = new int[m];
		for (int i = 0; i< m; i++) {
			left[i] = A[i];
		}

		int[] right = new int[A.size()-m];
		for (int i = m; i < A.size(); i++) {

		}
	}

	/* isSorted()
	 Check whether or not the given array is successfully sorted.
	 If it is, return true; otherwise return false.
	*/
    public static boolean isSorted(int[] A, int le, int ri){
    	for (int i= le+1;i<=ri;i++)
    		if (A[i]<A[i-1]) return false;
    	return true;
    }


	/* main()
	 Contains code to test the PairSum225 function.
	*/
	public static void main(String[] args){
		Scanner s;
		if (args.length > 0){
			try{
				s = new Scanner(new File(args[0]));
			} catch(java.io.FileNotFoundException e){
				System.out.printf("Unable to open %s\n",args[0]);
				return;
			}
			System.out.printf("Reading input values from %s.\n",args[0]);
		}else{
			s = new Scanner(System.in);
			System.out.printf("Enter a list of non-negative integers. Enter a negative value to end the list.\n");
		}
		Vector<Integer> inputVector = new Vector<Integer>();

		int v;
		while(s.hasNextInt() && (v = s.nextInt()) >= 0)
			inputVector.add(v);

		int[] array = new int[inputVector.size()];

		for (int i = 0; i < array.length; i++)
			array[i] = inputVector.get(i);

		System.out.printf("Read %d values.\n",array.length);


		long startTime = System.currentTimeMillis();

		boolean pairExists = PairSum225(array);

		long endTime = System.currentTimeMillis();

		double totalTimeSeconds = (endTime-startTime)/1000.0;

		System.out.printf("Array %s a pair of values which add to 225.\n",pairExists? "contains":"does not contain");
		System.out.printf("Total Time (seconds): %.4f\n",totalTimeSeconds);
	}
}
