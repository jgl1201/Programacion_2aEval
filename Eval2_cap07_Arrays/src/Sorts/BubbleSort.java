package Sorts;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		int aux;
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					aux = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = aux;
				}
			}
		}
	}
}
