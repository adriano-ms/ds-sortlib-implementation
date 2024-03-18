package view;

import java.util.Arrays;

import br.edu.fateczl.sort.Sort;

public class Main {

	public static void main(String[] args) {
		
		int[] ex01 = new int[] {74,20,74,87,81,16,25,99,44,58};
		int[] ex02 = new int[] {44, 43, 42, 41, 40, 39, 38};
		int[] ex03 = new int[] {31, 32, 33, 34, 99, 98, 97, 96};
		
		System.out.println("Ex01:");
		System.out.println("Original: " + Arrays.toString(ex01));
		Sort.quickSort(ex01);
		System.out.println("Sorted: " + Arrays.toString(ex01));
		System.out.println();
		
		System.out.println("Ex02:");
		System.out.println("Original: " + Arrays.toString(ex02));
		Sort.quickSort(ex02);
		System.out.println("Sorted: " + Arrays.toString(ex02));
		System.out.println();
		
		System.out.println("Ex03:");
		System.out.println("Original: " + Arrays.toString(ex03));
		Sort.quickSort(ex03);
		System.out.println("Sorted: " + Arrays.toString(ex03));
		
	}

}
