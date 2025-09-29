package pack;
import java.util.Random;
public class SortingTester {

	public static void main(String[] args) {
		int[] sizes = {100, 1000, 10000, 100000, 1000000};
		Random rand = new Random();
		for (int n : sizes) {
			System.out.println("Size: "+n);
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = rand.nextInt();
			}
			int[] arr1 = arr.clone();
			long start1 = System.currentTimeMillis();
			QuadSorts.bubbleSort(arr1);
			long end1 = System.currentTimeMillis();
			System.out.println("Bubble time: "+(end1-start1)+" ms");
			
			int[] arr2 = arr.clone();
			long start2 = System.currentTimeMillis();
			QuadSorts.insertionSort(arr2);
			long end2 = System.currentTimeMillis();
			System.out.println("Insertion time: "+(end2-start2)+" ms");
			
			int[] arr3 = arr.clone();
			long start3 = System.currentTimeMillis();
			QuadSorts.selectionSort(arr3);
			long end3 = System.currentTimeMillis();
			System.out.println("Selection time: "+(end3-start3)+" ms");
			
			int[] arr4 = arr.clone();
			long start4 = System.currentTimeMillis();
			QuadSorts.mergeSort(arr4);
			long end4 = System.currentTimeMillis();
			System.out.println("Merge time: "+(end4-start4)+" ms");
		}

	}

}
