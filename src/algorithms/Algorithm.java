package algorithms;

import structures.Vector;

public abstract class Algorithm<T extends Comparable<T>> {

	protected Vector<T> arr;
	protected int steps;

	public Algorithm(Vector<T> arr) {
		this.arr = arr;
	}

	public int getSteps() {
		return this.steps;
	}

	public boolean isSorted() {
		boolean sorted = true;
		for (int i=1; i<this.arr.size() && sorted; i++) {
			sorted = arr.getValue(i).compareTo(arr.getValue(i-1)) >= 0;
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
			for (int i=0; i<this.arr.size(); i++) {
				T number = this.arr.getValue(i);
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
