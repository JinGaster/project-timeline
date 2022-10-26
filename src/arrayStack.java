import java.util.Arrays;

public class arrayStack<E> {
	E[] arrayStack;
	int size = 0;
	E recentRemoved = null;
	int methodRun = 0;
	
	public arrayStack(int capacity){
		arrayStack = (E[]) new Object[capacity];
	}
	
	public void add(E value) {
		// aka push, will add a value at the end of the list.
		if(size <= -1) {
			arrayStack[0] = value;
		}
		else {
			arrayStack[size] = value;
		}
		size++;
	}
	
	public E remove() {
		// aka pop, will remove the value at the end of the list.
		//if(size <= 0) {
			//recentRemoved = arrayStack[0];
			//arrayStack[0] = null;
		//}
		//else {
			recentRemoved = arrayStack[size-1]; /*this is broken*/
			arrayStack[size-1] = null;
		//}
		size--;
		return recentRemoved;
	}
	
	public E decreaseAfterFirst() {
		if(size <= 0) {
			recentRemoved = arrayStack[0];
			arrayStack[0] = null;
		}
		else {
			recentRemoved = arrayStack[size-1];
			arrayStack[size-1] = null;
		}
		if(methodRun != 0) {
			size--;
		}
		methodRun++;
		return recentRemoved;
	}
	
	// create methods that return size, if the list is empty, and the first element (the element that
	// would have been removed, without removing it).
	public int findSize() {
		return size;
	}
	
	public boolean testIfEmpty() {
		if(size <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public E giveFirstElement() {
		// aka peak
		if(size == 0) {
			recentRemoved = arrayStack[0];
		}
		else if(size <= -1) {
			recentRemoved = null;
		}
		else {
			recentRemoved = arrayStack[size-1];
		}
		return recentRemoved;
	}
	
	public String toString() {
		//String temp = "";
		//for(int i = 0; i < size; i++) {
		//	temp += "value of " + arrayStack[i] + " and position of " + i + "  ->  ";
		//}
		//temp += "end of list.";
		return Arrays.toString(arrayStack);
	}
}