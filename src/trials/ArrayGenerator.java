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
}
