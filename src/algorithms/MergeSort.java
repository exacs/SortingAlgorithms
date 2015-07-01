
package algorithms;

import structures.Vector;


public class MergeSort<T extends Comparable<T>> extends Algorithm<T> {

	public MergeSort(Vector<T> arr) {
		super(arr);
	}
	
	@Override
	public void sort() {
		// Divide
		Vector<T> arr1;
		Vector<T> arr2;
		
		// If there are zero or one elements
		if (this.arr.size()<=1) {
			this.steps=1;
			return;
		}
		
		// If there are two elements
		if (this.arr.size()==2) {
			// compare them and swap if necessary
			if (this.arr.getValue(0).compareTo(this.arr.getValue(1)) > 0) {
				T aux = this.arr.getValue(0);
				this.arr.setValue(0, this.arr.getValue(1));
				this.arr.setValue(1, aux);
			}
			this.steps=1;
			return;
		}
		
		// In other cases
		// Divide
		int half = this.arr.size() / 2;
		
		arr1 = new Vector<T>(half);
		for (int i=0; i<arr1.size(); i++) {
			this.steps++;
			arr1.setValue(i, this.arr.getValue(i));
		}
		
		arr2 = new Vector<T>(this.arr.size() - half);
		for (int i=0; i<arr2.size(); i++) {
			this.steps++;
			arr2.setValue(i, this.arr.getValue(i+half));
		}
		
		
		// Sort them individually
		MergeSort<T> m1 = new MergeSort<T>(arr1);
		m1.sort();
		this.steps += m1.getSteps();
		
		MergeSort<T> m2 = new MergeSort<T>(arr2);
		m2.sort();
		this.steps += m2.getSteps();
		
		// Merge
		arr1 = m1.getArr();
		arr2 = m2.getArr();
		
		int i1 = 0;
		int i2 = 0;
		
		for (int i=0; i<this.arr.size(); i++) {
			this.steps++;
			T next;
			
			if (i2>=arr2.size() || (i1<arr1.size() && arr1.getValue(i1).compareTo(arr2.getValue(i2)) <= 0)) {
				next = arr1.getValue(i1);
				i1++;
			} else {
				next = arr2.getValue(i2);
				i2++;
			}
			
			this.arr.setValue(i, next);
		}
	}
	
	private Vector<T> getArr() {
		return this.arr;
	}

}
