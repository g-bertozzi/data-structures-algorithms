import java.util.Random;
//import java.util.Arrays;

public class arrayAnalysis {

	/*
	long startTime = System.currentTimeMillis(); 
	result=youralgorithm.yourfunction(input); 
	System.out.println(result);
	long endTime = System.currentTimeMillis(); 
	double timeml = (endTime-startTime)/100.0;
	System.out.printf("Total Time%.4f\n", timeml);
	*/

	public static void insertionRunTime(int[] arr) {
		
        int[] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);

		long startTime = System.nanoTime();
		int result = Insertion.CountInversions(copy);
		System.out.printf("Results: %d\n",result);
		long endTime = System.nanoTime(); 
		double timeml = (endTime-startTime)/1e9;
		System.out.printf("Total Time: %.6f\n", timeml);
		System.out.println();
	}

	public static void blindRunTime(int[] arr) {

		int[] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);

		long startTime = System.nanoTime(); 
		int result = Blind.CountInversions(copy);
		System.out.printf("Results: %d\n",result);
		long endTime = System.nanoTime(); 
		double timeml = (endTime-startTime)/1e9;
		System.out.printf("Total Time: %.6f\n", timeml);
		System.out.println();
	}

	public static void mergeRunTime(int[] arr) {

		int[] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);

		long startTime = System.nanoTime(); 
		int result = Merge.mergeSortAndCount(copy, 0, copy.length - 1);
		System.out.printf("Results: %d\n",result);
		long endTime = System.nanoTime(); 
		double timeml = (endTime-startTime)/1e9;
		System.out.printf("Total Time: %.6f\n", timeml);
		System.out.println();
	}

    public static void main(String[] args) {

		// PART A
		Random rand = new Random();
		int n = 1000;
		
		int[] a1 = new int[n]; // [1, ..., 1000]
		int[] a2 = new int[n]; // [1000,..., 1]
		int[] a3 = new int[n]; // random in [1, 1000]

		for (int i = 0; i < n; i++) {
			a1[i] = i + 1;
            //System.out.println(a1[i]);
		}

        for (int i = 0; i < n; i++) {
			a2[1000 - i - 1] = i + 1;
            //System.out.println(a2[i]);
		}

        for (int i = 0; i < n; i++) {
			// range [0,1000] but offset by adding 1 to make it [1,1000]
			a3[i] = rand.nextInt(1000) + 1;
            //System.out.println(a3[i]);
		}

		// PART B
		System.out.println("A) BLIND");
		System.out.println();

		System.out.println("on dataset 1 ");
		blindRunTime(a1);
		System.out.println("on dataset 2 ");
		blindRunTime(a2);
		System.out.println("on dataset 3 ");
		blindRunTime(a3);

		System.out.println("B) INSERTION");
		System.out.println();

		System.out.println("on dataset 1 ");
		insertionRunTime(a1);
		System.out.println("on dataset 2 ");
		insertionRunTime(a2);
		System.out.println("on dataset 3 ");
		insertionRunTime(a3);

		System.out.println("C) MERGE");
		System.out.println();

		System.out.println("on dataset 1 ");
		mergeRunTime(a1);
		System.out.println("on dataset 2 ");
		mergeRunTime(a2);
		System.out.println("on dataset 3 ");
		mergeRunTime(a3);

		// PART C

    }
}
