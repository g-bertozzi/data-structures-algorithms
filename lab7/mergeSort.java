public static void mergeSort(int[] arr, int n) {
		if (n < 2) {
			return;
		}
		int m = n/2;
		int[] l = new int[m];
		int[] r = new int[n - m];

		for (int i = 0; i < m; i++) {
			l[i] = arr[i];
		}

		for (int i = m; i < n; i++) {
			r[i] = arr[i];
		}

		mergeSort(l, m);
		mergeSort(r, n - m);

		merge(arr, l, r, m, n - m);

	}

    public static void merge(int[] arr, int[] l, int[] r, int left, int right) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left && j < right) {
			if (l[i] < r[i]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[i++];
			}
		}

		while (i < left) {
			arr[k++] = l[i++];
		}

		while (i < right) {
			arr[k++] = r[i++];
		}
	}

    public static void main(){
        print
    }


