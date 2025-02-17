import java.util.*;
import java.io.*;


public class Insertion{

	public static int CountInversions(int[] arr){
        //DONE IN LAB 7, Use your code
		
		int n  = arr.length;

        if (n < 2) {
            return 0;
        }

        int counter = 0;

		// iterate through array starting at 2nd element
        for (int i = 1; i < n; i++ ) { 
			int val  = arr[i]; // store element so we can move array if needed
			int j = i - 1;

			// for each val (element) we check if element to the left is less than it
				// if it's not we move the left elemenet to the right, until we find an element that is less or index=0
			while ((j >= 0) && (arr[j] > val)) { 
				arr[j+1] = arr[j];
				j--;
				counter ++;
			}
			// once we have moved bigger elements to the right we can insert val at correct position
			arr[j+1] = val;
        }

        return counter;
	}

	public static void main(String []args){
			
		}
}
