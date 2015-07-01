package algorithms;

import structures.Vector;

public class CombSort<T extends Comparable<T>> extends Algorithm<T> {

	public CombSort(Vector<T> arr) {
		super(arr);
	}

	@Override
	public void sort() {
		// This will count the swaps done in a full loop
		int swaps = 0;

		// A gap starting from the length
		int gap = arr.size()-1;
		
		while (swaps>0 || gap>1) {
			swaps=0;
			// Loop from the end to i
			for (int j=this.arr.size()-1; j-gap>=0; j--) { //j=0
				this.steps++;
				// Compare an element with the separated with gap
				if (this.arr.getValue(j).compareTo(this.arr.getValue(j-gap)) < 0) {
					// swap
					T aux = this.arr.getValue(j);
					this.arr.setValue(j, this.arr.getValue(j-gap));
					this.arr.setValue(j-gap, aux);
					swaps++;
				}
			}//for
			if (gap>1) {
				swaps = 1;
				gap = (int) (gap / 1.3);
			}
			if (gap==9 || gap==10) {
				gap = 11;
			}
		}//while
	}
}
