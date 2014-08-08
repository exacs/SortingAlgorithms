package trials;

import algorithms.*;

public class TrialIO {

	public static void main(String[] args) {
		int[] arr = ArrayGenerator.randomUnique(100);
		
		Algorithm a;
		
		a = new BubbleSort(arr.clone());
		a.sort();
		System.out.println(a);
		
		a = new CombSort(arr.clone());
		a.sort();
		System.out.println(a);
		
		a = new InsertionSort(arr.clone());
		a.sort();
		System.out.println(a);
		
		a = new MergeSort(arr.clone());
		a.sort();
		System.out.println(a);
		
		a = new HeapSort(arr.clone());
		a.sort();
		System.out.println(a);
	}

}
