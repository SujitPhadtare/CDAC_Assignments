package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 10, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 1 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
