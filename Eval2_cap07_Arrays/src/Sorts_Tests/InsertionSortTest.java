package Sorts_Tests;

import java.util.Arrays;

import Sorts.InsertionSort;

public class InsertionSortTest {
	
	public static void main(String[] args) {
		int[] values = {15, 12, 60, 18, 22, 1, 45};
		System.out.println(Arrays.toString(values));
		InsertionSort.insertionSort(values);
		System.out.println(Arrays.toString(values));
	}

}
