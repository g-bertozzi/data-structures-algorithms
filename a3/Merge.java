// Java implementation of the approach https://www.geeksforgeeks.org/inversion-count-in-array-using-merge-sort/
import java.util.Arrays;
import java.util.*;
import java.io.*;
public class Merge {

	// Function to count the number of inversions
	// during the merge process
	public static int mergeAndCount(int[] arr, int l,int m, int r)
	{

		// Left subarray
		int[] left = Arrays.copyOfRange(arr, l, m + 1);

		// Right subarray
		int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

		int i = 0, j = 0, k = l, swaps = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j])
				arr[k++] = left[i++];
			else {
				arr[k++] = right[j++];
				swaps += (m + 1) - (l + i);
			}
		}
		while (i < left.length)
			arr[k++] = left[i++];
		while (j < right.length)
			arr[k++] = right[j++];
		return swaps;
	}

	// Merge sort function
	public static int mergeSortAndCount(int[] arr, int l,int r)
	{

		// Keeps track of the inversion count at a
		// particular node of the recursion tree
		int count = 0;

		if (l < r) {
			int m = (l + r) / 2;

			// Total inversion count = left subarray count
			// + right subarray count + merge count

			// Left subarray count
			count += mergeSortAndCount(arr, l, m);

			// Right subarray count
			count += mergeSortAndCount(arr, m + 1, r);

			// Merge count
			count += mergeAndCount(arr, l, m, r);
		}

		return count;
	}

	
	public static void main(String[] args) {

		}

		
	
}

