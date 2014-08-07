package algorithms;

public class CombSort extends Algorithm {

	public CombSort(int[] arr) {
		super(arr);
	}

	@Override
	public void sort() {
		// This will count the swaps done in a full loop
		int swaps = 0;

		// A gap starting from the length
		int gap = arr.length-1;
		
		while(swaps>0 || gap>1) {
			swaps=0;
			// Loop from the end to i
			for (int j=this.arr.length-1; j-gap>=0; j--) { //j=0
				this.steps++;
				// Compare an element with the separated with gap
				if (this.arr[j] < this.arr[j-gap]) {
					// swap
					int aux = this.arr[j];
					this.arr[j] = this.arr[j-gap];
					this.arr[j-gap] = aux;
					swaps++;
				}
			}//for
			if (gap>1) {
				gap = (int) (gap / 1.3);
			}
			if (gap==9 || gap==10) {
				gap = 11;
			}
		}//while
	}
}
