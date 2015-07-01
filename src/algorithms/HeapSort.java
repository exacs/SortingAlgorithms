package algorithms;

import structures.Vector;

public class HeapSort<T extends Comparable<T>> extends Algorithm<T> {

	public HeapSort(Vector<T> arr) {
		super(arr);
	}

	@Override
	public void sort() {
		// Create the heap
		for (int i=1; i<this.arr.size(); i++) {
			// i = right side of the heap
			// Move the element upside
			int moving = i;
			int parent = (moving-1)/2;
			while (parent>=0 && this.arr.getValue(moving).compareTo(this.arr.getValue(parent)) > 0) {
				this.steps++;
				// swap
				T aux = this.arr.getValue(moving);
				this.arr.setValue(moving, this.arr.getValue(parent));
				this.arr.setValue(parent, aux);
				
				moving = parent;
				parent = (moving-1)/2;
			}
		}
		
		// Replace the peak with the last
		for (int i=this.arr.size()-1; i>0; i--) {
			// Declare the new peak
			this.arr.setValue(i, this.arr.getValue(0));
			
			// Move the peak element downside
			int mov = 0;
			int ch1 = mov*2+1;
			int ch2 = mov*2+2;
			boolean swap = true;
			while (swap) {
				this.steps++;
				if (ch1<=i && this.arr.getValue(mov).compareTo(this.arr.getValue(ch1)) < 0) {
					swap = true;
					mov = ch1;
					
					T aux = this.arr.getValue(mov);
					this.arr.setValue(mov, this.arr.getValue(ch1));
					this.arr.setValue(ch1, aux);
				} else if (ch2<=i && this.arr.getValue(mov).compareTo(this.arr.getValue(ch2)) < 0) {
					swap = true;
					mov = ch2;
					
					T aux = this.arr.getValue(mov);
					this.arr.setValue(mov, this.arr.getValue(ch2));
					this.arr.setValue(ch2, aux);
				} else {
					swap = false;
				}
				ch1 = mov*2+1;
				ch2 = mov*2+2;
			}
		}
	}

}
