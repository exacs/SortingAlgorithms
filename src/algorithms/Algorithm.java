	package algorithms;
	
	public abstract class Algorithm {
		
		protected int[] arr;
		protected int steps;
		
		public Algorithm(int[] arr) {
			this.arr = arr;
			this.steps = 0;
		}
		
		public int getSteps() {
			return this.steps;
		}
		
		public boolean isSorted() {
			boolean sorted = true;
			for (int i=1; i<this.arr.length && sorted; i++) {
				sorted = arr[i-1]<=arr[i];
			}
			return sorted;
		}
		
		public abstract void sort();
	}
