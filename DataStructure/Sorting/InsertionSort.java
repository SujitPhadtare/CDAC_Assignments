package insertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					continue;
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 10, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 1 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
