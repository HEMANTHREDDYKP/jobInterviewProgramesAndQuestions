package room;

import java.util.Iterator;

public class SelectionSort {

	static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		sort(new int[] { 45, 7, 3, 87, 4, 12 });

	}

}
