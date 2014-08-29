package trials;

import java.util.Random;

public class ArrayGenerator {
	private ArrayGenerator() {}
	
	public static int[] random(int n) {
		int[] arr = new int[n];
		
		Random r = new Random();
		for (int i=0; i<n; i++) {
			arr[i] = r.nextInt(n);
		}
		
		return arr;
	}
	
	public static int[] randomUnique(int n) {
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = i;
		}
		Random r = new Random();
		int j;
		
		for (int i=0; i<n; i++) {
			j = r.nextInt(n);
			
			int aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
		}
		
		return arr;
	}
	
	public static int[] inverted(int n) {
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = n-i-1;
		}
		return arr;
	}
	
	public static int[] almostOrdered(int n) {
		int[] arr = new int[n];
		Random r = new Random();
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
	
	public static int[] fewElements(int n) {
		int[] arr = new int[n];
		int els = (int) Math.log10(n) + 1;
		
		for (int i=0; i<n; i++) {
			arr[i] = i % els;
		}
		
		Random r = new Random();
		int j;
		
		for (int i=0; i<n; i++) {
			j = r.nextInt(n);
			
			int aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
		}
		
		return arr;
	}
}
