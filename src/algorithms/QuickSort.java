package algorithms;

import java.util.LinkedList;

public class QuickSort extends Algorithm {

	// We use a queue instead of the array for performance
	private LinkedList<Integer> list = new LinkedList<Integer>();

	public QuickSort(int[] arr) {
		super(arr);

		// Convert the array into a list
		for (int i=0; i<arr.length; i++) {
			this.list.addLast(arr[i]);
		}
	}

	private QuickSort(LinkedList<Integer> list) {
		super(new int[0]);
		this.list = list;
	}

	@Override
	public void sort() {
		// Define a pivot from the mean of first, intermediate and last
		int pivot;
		if (this.list.size()==2) {
			pivot = Math.max(this.list.getLast(), this.list.getFirst());
		} else {
			pivot = (this.list.getFirst() + this.list.get(this.list.size()/2) + this.list.getLast())/3;
		}
		
		// Split the queue into three Queues
		LinkedList<Integer> left = new LinkedList<Integer>();
		LinkedList<Integer> center = new LinkedList<Integer>();
		LinkedList<Integer> right = new LinkedList<Integer>();
		
		while (!this.list.isEmpty()) {
			int extraction = this.list.removeFirst();
			if (extraction<pivot) {
				left.add(extraction);
			} else if (extraction>pivot) {
				right.add(extraction);
			} else {
				center.add(extraction);
			}
			this.steps++;
		}
		
		// Sort each separately
		// If there is more than one element
		if (left.size()>1) {
			QuickSort qsL = new QuickSort(left);
			qsL.sort();
			left = qsL.getList();
			this.steps += qsL.getSteps();
		}
		if (right.size()>1) {
			QuickSort qsR = new QuickSort(right);
			qsR.sort();
			right = qsR.getList();
			this.steps += qsR.getSteps();
		}
		
		this.list.addAll(left);
		this.list.addAll(center);
		this.list.addAll(right);

		// Convert the queue into an array
		for (int i=0; i<this.arr.length; i++) {
			this.arr[i] = this.list.get(i);
		}
		
	}

	private LinkedList<Integer> getList() {
		return this.list;
	}
}
