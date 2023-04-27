package Sorts_Tests;

import java.util.Arrays;

import Sorts.MergeSort;

public class MergeSortTest {
	
	public static void main(String[] args) {
		int[] values = {15, 12, 60, 18, 22, 1, 45};
		System.out.println(Arrays.toString(values));
		MergeSort.mergeSort(values, 0, values.length - 1);
		System.out.println(Arrays.toString(values));
	}

}
