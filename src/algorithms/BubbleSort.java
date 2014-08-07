package algorithms;

public class BubbleSort extends Algorithm {
	public BubbleSort(int[] arr) {
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
			for (int j=this.arr.length-1; j>i; j--) { //j=0
				this.steps++;
				// Compare an element with the separated with gap
				if (this.arr[j] < this.arr[j-1]) {
					// swap
					int aux = this.arr[j];
					this.arr[j] = this.arr[j-1];
					this.arr[j-1] = aux;
					swaps++;
				}
			}//for
			i++;
		} while(swaps>0 && i<this.arr.length-1);
	}

}
