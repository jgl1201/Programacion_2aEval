package Sorts_Tests;

import java.util.Arrays;

import Sorts.SelectionSort;

public class SelectionSortTest {
	
	public static void main(String[] args) {
		int[] values = {15, 12, 60, 18, 22, 1, 45};
		System.out.println(Arrays.toString(values));
		SelectionSort.selectionSort(values);
		System.out.println(Arrays.toString(values));
	}

}
