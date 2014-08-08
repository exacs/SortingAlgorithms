package algorithms;

public class HeapSort extends Algorithm {

	public HeapSort(int[] arr) {
		super(arr);
	}

	@Override
	public void sort() {
		// Create the heap
		for (int i=1; i<this.arr.length; i++) {
			// i = right side of the heap
			// Move the element upside
			int moving = i;
			int parent = (moving-1)/2;
			while (parent>=0 && this.arr[moving] > this.arr[parent]) {
				this.steps++;
				// swap
				int aux = this.arr[moving];
				this.arr[moving] = this.arr[parent];
				this.arr[parent] = aux;
				
				moving = parent;
				parent = (moving-1)/2;
			}
		}
		
		// Replace the peak with the last
		for (int i=this.arr.length-1; i>0; i--) {
			// Declare the new peak
			int peak = this.arr[i];
			this.arr[i] = this.arr[0];
			
			// Move the element downside
			int mov = 0;
			int ch1 = mov*2+1;
			int ch2 = mov*2+2;
			boolean swap = true;
			while (swap) {
				this.steps++;
				if (ch1<=i && this.arr[mov] < this.arr[ch1]) {
					swap = true;
					mov = ch1;
					
					int aux = this.arr[mov];
					this.arr[mov] = this.arr[ch1];
					this.arr[ch1] = aux;
				} else if (ch2<=i && this.arr[mov] < this.arr[ch2]) {
					swap = true;
					mov = ch2;
					
					int aux = this.arr[mov];
					this.arr[mov] = this.arr[ch2];
					this.arr[ch2] = aux;
				} else {
					swap = false;
				}
				ch1 = mov*2+1;
				ch2 = mov*2+2;
			}
		}
	}

}
