package algorithms;
import structures.Vector;

public class BubbleSort<T extends Comparable<T>> extends Algorithm<T> {
	public BubbleSort(Vector<T> arr) {
		super(arr);
	}

	@Override
	public void sort() {
		// This will count the swaps done in a full loop
		int swaps = 0;

		// The left limit of the sorting
		int i = 0;
		
		do {
			swaps=0;
			// Loop from the end to i
			for (int j=this.arr.size()-1; j>i; j--) { //j=0
				this.steps++;
				// Compare an element with the separated with gap
				if (this.arr.getValue(j).compareTo(this.arr.getValue(j-1)) < 0) {
					// swap
					this.arr.swap(j, j-1);
					swaps++;
				}
			}//for
			i++;
		} while (swaps>0 && i<this.arr.size()-1);
	}

}
