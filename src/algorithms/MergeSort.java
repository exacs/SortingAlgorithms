
package algorithms;

public class MergeSort extends Algorithm {

	public MergeSort(int[] arr) {
		super(arr);
	}

	@Override
	public void sort() {
		// Divide
		int[] arr1;
		int[] arr2;
		
		// If there are zero or one elements
		if (this.arr.length<=1) {
			this.steps=1;
			return;
		}
		
		// If there are two elements
		if (this.arr.length==2) {
			// compare them and swap if necessary
			if (this.arr[0]>this.arr[1]) {
				int aux = this.arr[0];
				this.arr[0] = this.arr[1];
				this.arr[1] = aux;
			}
			this.steps=1;
			return;
		}
		
		// In other cases
		// Divide
		int half = this.arr.length / 2;
		
		arr1 = new int[half];
		for (int i=0; i<arr1.length; i++) {
			this.steps++;
			arr1[i] = this.arr[i];
		}
		
		arr2 = new int[this.arr.length - half];
		for (int i=0; i<arr2.length; i++) {
			this.steps++;
			arr2[i] = this.arr[i+half];
		}
		
		
		// Sort them individually
		MergeSort m1 = new MergeSort(arr1);
		m1.sort();
		this.steps += m1.getSteps();
		
		MergeSort m2 = new MergeSort(arr2);
		m2.sort();
		this.steps += m2.getSteps();
		
		// Merge
		arr1 = m1.getArr();
		arr2 = m2.getArr();
		
		int i1 = 0;
		int i2 = 0;
		
		for (int i=0; i<this.arr.length; i++) {
			this.steps++;
			int next = 0;
			
			if (i2>=arr2.length || (i1<arr1.length && arr1[i1]<=arr2[i2])) {
				next = arr1[i1];
				i1++;
			} else {
				next = arr2[i2];
				i2++;
			}
			
			this.arr[i] = next;
		}
	}
	
	private int[] getArr() {
		return this.arr;
	}

}
