package pack;

public class QuadSorts {
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n -1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
	public static int[] insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		} else {
			int mid = arr.length / 2;
			int[] left = java.util.Arrays.copyOfRange(arr, 0, mid);
	        int[] right = java.util.Arrays.copyOfRange(arr, mid, arr.length);
	        left = mergeSort(left);
	        right = mergeSort(right);
	        int[] merged = new int[left.length + right.length];
	        int i = 0, j = 0, k = 0;
	        
	        while (i < left.length && j < right.length) {
	        	if (left[i] <= right[j]) {
	        		merged[k++] = left[i++];
	        	} else {
	        		merged[k++] = right[j++];
	        	}
	        }
	        while (i < left.length) {
	            merged[k++] = left[i++];
	        }
	        while (j < right.length) {
	        	merged[k++] = right[j++];
	        }
	        return merged;
		}
	}

}
