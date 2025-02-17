import java.util.*;
import java.io.*;

public class CountInversions{

	//This method prints the contents of an int[]
	private static void printArray(int[] arr){
		//Prints out the contents of an array if it is not -1000, with each element in the array on a new line
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			
		}
	}

	public static int countInversions(int[] arr) {
        int n = arr.length; // Get the length of the array

        if (n < 2) {
            return 0; // If the array has 0 or 1 element, it is already sorted, so return
        }

        int counter = 0;

        for (int i = 1; i < n; i++) { // Iterate over the array starting from the second element

            int key = arr[i]; // Store the current element as the key to be inserted in the right position

            int j = i - 1;

            while (j >= 0 && key < arr[j]) { // Move elements greater than key one position ahead
                arr[j + 1] = arr[j]; // Shift elements to the right
                j--;
                counter++;
            }

            arr[j + 1] = key; // Insert the key in the correct position
        }
		//System.out.printf("counter: %d", counter);
        return counter;

	}

	public static void main(String []args){
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
			int numberOfInversions = countInversions(array);
			System.out.println(numberOfInversions);
			long endTime = System.currentTimeMillis();
			double totalTimeSeconds = (endTime-startTime)/1000.0;

			//System.out.printf("Array %s a pair of values which add to 225.\n",pairExists? "contains":"does not contain");
			System.out.printf("Total Time (seconds): %.4f\n",totalTimeSeconds);
		}
}
