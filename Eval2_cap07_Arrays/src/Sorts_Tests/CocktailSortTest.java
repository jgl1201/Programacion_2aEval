package Sorts_Tests;

import java.util.Arrays;

import Sorts.CocktailSort;

public class CocktailSortTest {
	
	public static void main(String[] args) {
		int[] values = {15, 12, 60, 18, 22, 1, 45};
		System.out.println(Arrays.toString(values));
		CocktailSort.cocktailSort(values);
		System.out.println(Arrays.toString(values));
	}

}
