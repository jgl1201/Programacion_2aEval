package Sorts;

public class SelectionSort {

	public static void selectionSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i; j < data.length; j++) {
				if (data[i] > data[j]) {
					Integer aux = data[j];
					data[j] = data[i];
					data[i] = aux;
				}
			}
		}
	}

}
