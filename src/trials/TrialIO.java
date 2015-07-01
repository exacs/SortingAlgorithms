package trials;

import structures.Vector;
import algorithms.*;

public class TrialIO {

	public static void main(String[] args) {
		int[] arr = ArrayGenerator.randomUnique(100);
		Vector<Integer> v = new Vector<Integer>(100);
		
		for (int i=0; i<arr.length; i++)
			v.setValue(i, arr[i]);
		
		Algorithm<Integer> a;
		
		a = new BubbleSort<Integer>(v.clone());
		a.sort();
		System.out.println(a);
		
		
		a = new CombSort<Integer>(v.clone());
		a.sort();
		System.out.println(a);
		
		a = new InsertionSort<Integer>(v.clone());
		a.sort();
		System.out.println(a);
		
		a = new MergeSort<Integer>(v.clone());
		a.sort();
		System.out.println(a);
		
		a = new HeapSort<Integer>(v.clone());
		a.sort();
		System.out.println(a);
	}

}
