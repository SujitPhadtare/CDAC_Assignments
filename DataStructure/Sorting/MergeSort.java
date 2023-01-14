package mergeSort;

import java.util.Arrays;

public class MergeSort {

	public static void divide(int arr[], int begin, int end) {
		if (begin >= end) {
			return;
		}
		int mid = begin + (end - begin) / 2;
		divide(arr, begin, mid);
		divide(arr, mid + 1, end);
		merge(arr, begin, mid, end);
	}

	public static void merge(int arr[], int begin, int mid, int end) {
		int merged[] = new int[end - begin + 1];

		int idx1 = begin; // tracks first arr
		int idx2 = mid + 1; // tracks second arr
		int x = 0; // tracks merged arr

		while (idx1 <= mid && idx2 <= end) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while (idx2 <= end) {
			merged[x++] = arr[idx2++];
		}

		for (int i = 0, j = begin; j <= end; i++, j++) {
			arr[j] = merged[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 5, 4, 4, 0, 3, 2, 1, 1 };
		divide(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
