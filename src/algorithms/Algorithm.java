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
		
		@Override
		public String toString() {
			String str = "";
			if (this.isSorted()) {
				// Show the steps amount
				str += "Sorted in " + this.steps + " steps using " + this.getClass().getSimpleName();
			} else {
				// Show the whole array
				for (int i=0; i<this.arr.length; i++) {
					int number = this.arr[i];
					if (number<10) {
						str += " ";
					}
					str += number + " ";
					if (i%20==19) {
						str +="\n";
					}
				}
			}
			return str;
		}
		
		public abstract void sort();
	}
