package Sorts;

public class AllSorts {
	
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
	
	public static int[] cocktailSort(int[] numbers) {
		boolean swapped = true;
		int i = 0;
		int j = numbers.length - 1;
		while (i < j && swapped) {
			swapped = false;
			for (int k = i; k < j; k++) {
				if (numbers[k] > numbers[k + 1]) {
					int temp = numbers[k];
					numbers[k] = numbers[k + 1];
					numbers[k + 1] = temp;
					swapped = true;
				}
			}
			j--;
			if (swapped) {
				swapped = false;
				for (int k = j; k > i; k--) {
					if (numbers[k] < numbers[k - 1]) {
						int temp = numbers[k];
						numbers[k] = numbers[k - 1];
						numbers[k - 1] = temp;
						swapped = true;
					}
				}
			}
			i++;
		}
		return numbers;
	}

	public static void insertionSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			Integer aux = data[i];
			int j = i - 1;
			while (j >= 0 && data[j] > aux) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = aux;
		}
	}
	
	public static void merge(int A[], int izq, int m, int der) {
		int i, j, k;
		int[] B = new int[A.length]; // array auxiliar
		for (i = izq; i <= der; i++) // copia ambas mitades en el array auxiliar
			B[i] = A[i];

		i = izq;
		j = m + 1;
		k = izq;

		while (i <= m && j <= der) // copia el siguiente elemento más grande
			if (B[i] <= B[j])
				A[k++] = B[i++];
			else
				A[k++] = B[j++];

		while (i <= m) // copia los elementos que quedan de la
			A[k++] = B[i++]; // primera mitad (si los hay)
	}

	public static void mergeSort(int A[], int izq, int der) {
		if (izq < der) {
			int m = (izq + der) / 2;
			mergeSort(A, izq, m);
			mergeSort(A, m + 1, der);
			merge(A, izq, m, der);
		}
	}

	public static void quickSort(int[] items, int left, int right) {
		int i, j;
		int x, y;

		i = left;
		j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j) quickSort(items, left, j);
		if (i < right) quickSort(items, i, right);
	}
	
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
