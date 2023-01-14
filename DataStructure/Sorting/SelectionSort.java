package selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, 10, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 1 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
