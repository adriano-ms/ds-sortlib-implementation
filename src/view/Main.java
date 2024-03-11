package view;

import br.edu.fateczl.sort.Sort;

public class Main {

	public static void main(String[] args) {
		
		int array[] = new int[] {74,20,74,87,81,16,25,99,44,58};
		
		int array2[] = new int[] {44,43,42,41,40,39,38};
		
		array = Sort.bubbleSort(array);
		array2 = Sort.bubbleSort(array2);
		
		System.out.println("Bubble Sort:");
		System.out.println("Ex.1:");
		for(int n : array)
			System.out.print(n + " ");
		
		System.out.println("\n\nEx.2:");
		
		for(int n : array2)
			System.out.print(n + " ");
		
		array = new int[] {74,20,74,87,81,16,25,99,44,58};
		
		array2 = new int[] {44,43,42,41,40,39,38};
		
		array = Sort.mergeSort(array, 0, array.length - 1);
		array2 = Sort.mergeSort(array2, 0, array2.length - 1);
		
		System.out.println("\n\nMerge Sort:");
		System.out.println("Ex.1:");
		for(int n : array)
			System.out.print(n + " ");
		
		System.out.println("\n\nEx.2:");
		
		for(int n : array2)
			System.out.print(n + " ");
		
		
	}

}
