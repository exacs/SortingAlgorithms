package trials;

import java.util.Random;

public class ArrayGenerator {
	private ArrayGenerator() {}
	
	// Shuffles an array
	private static int[] shuffle(int[] arr) {
		Random r = new Random();
		int j;
		int n = arr.length;
		
		for (int i=0; i<n; i++) {
			j = r.nextInt(n);
			
			int aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
		}
		
		return arr;
	}
	
	/** Returns an array of "n" elements shuffled */
	public static int[] random(int n) {
		int[] arr = new int[n];
		
		Random r = new Random();
		for (int i=0; i<n; i++) {
			arr[i] = r.nextInt(n);
		}
		
		return arr;
	}
	
	/** Returns an array with "n" different elements (from 0 to n-1) randomly positioned */
	public static int[] randomUnique(int n) {
		return shuffle(inverted(n));
	}
	
	/** Returns an array with numbers from "n" to 0 */
	public static int[] inverted(int n) {
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = n-i-1;
		}
		return arr;
	}
	
	/** Return an array of "n" elements, sorted except by one element */
	public static int[] almostOrdered(int n) {
		int[] arr = new int[n];
		Random r = new Random();
		
		// Index of the non-sorted element
		int e = r.nextInt(n-1);
		
		for (int i=0; i<n; i++) {
			if (i==e) {
				arr[i] = i+1;
			} else if (i==e+1) {
				arr[i] = i-1;
			} else {
				arr[i] = i;
			}
		}
		return arr;
	}
	
	/** Return an "n"-sized array with only log10(n) different elements */
	public static int[] fewElements(int n) {
		int[] arr = new int[n];
		int els = (int) Math.log10(n) + 1;
		
		for (int i=0; i<n; i++) {
			arr[i] = i % els;
		}
		
		return shuffle(arr);
	}
}
