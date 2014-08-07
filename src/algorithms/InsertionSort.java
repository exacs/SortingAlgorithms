package algorithms;

public class InsertionSort extends Algorithm {

	public InsertionSort(int[] arr) {
		super(arr);
	}

	@Override
	public void sort() {
		for (int i=1; i<this.arr.length; i++) {
			int moving = this.arr[i];
			
			for (int j=i-1; j>=0; j--) {
				this.steps++;
				if (moving < this.arr[j]) {
					// Move element in j
					this.arr[j+1] = this.arr[j];
				} else {
					// Place moving element
					this.arr[j+1] = moving;
					
					// Force end of loop
					j = -1;
				} //if
			}// for j
		}//for i
	}

}
