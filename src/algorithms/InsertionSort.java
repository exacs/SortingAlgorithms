package algorithms;

import structures.Vector;

public class InsertionSort<T extends Comparable<T>> extends Algorithm<T> {

	public InsertionSort(Vector<T> arr) {
		super(arr);
	}

	@Override
	public void sort() {
		for (int i=1; i<this.arr.size(); i++) {
			T moving = this.arr.getValue(i);
			
			for (int j=i-1; j>=0; j--) {
				this.steps++;
				if (moving.compareTo(this.arr.getValue(j)) < 0) {
					// Move element in j
					this.arr.setValue(j+1, this.arr.getValue(j));
				} else {
					// Place moving element
					this.arr.setValue(j+1, moving);
					
					// Force end of loop
					j = -1;
				} //if
			}// for j
		}//for i
	}

}
