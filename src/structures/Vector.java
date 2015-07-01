package structures;

public class Vector<T> implements Cloneable {
	static class Node<T> {
		T value;
		int[] indexes = new int[10000];
		int n;
		
		void setIndex(int index) {indexes[n++] = index;}
	}
	Node<T> array[];
	
	@SuppressWarnings("unchecked")
	public Vector(int size) {
		array = new Node[size];
		for (int i=0; i<size; i++)
			array[i] = new Node<T>();
	}
	
	public int size() {
		return array.length;
	}
	
	public T getValue(int key) {
		return array[key].value;
	}
	
	public void setValue(int key, T value) {
		array[key].value = value;
	}
	
	public void swap(int i, int j) {
		Node<T> aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}
	
	public void updateIndexes() {
		for (int i=0; i<array.length; i++) {
			array[i].setIndex(i);
		}
	}
	
	public Vector<T> clone() {
		Vector<T> cloned = new Vector<T>(this.size());
		
		for (int i=0; i<this.size(); i++)
			cloned.setValue(i, this.getValue(i));
		
		return cloned;
	}
}
