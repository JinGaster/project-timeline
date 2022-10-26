import java.util.Arrays;

public class heap {
	// setting defaults
	int[] heap;
	int size = 0;
	int recentRemoved = 0;
	int removeAt = 0;
	int maxSize = 0;
	int position = 0;
	
	// constructor of heap with set capacity.
	public heap(int capacity){
		heap = new int[capacity];
		maxSize = capacity;
	}
	
	// add method taken from arrayStack.
	public void add(int value) {
		// aka push, will add a value at the end of the list.
		heap[size] = value;
		// special heap property time: in a heap, a node-child's value is always
		//                             less than its parent value.
		// to make this possible, the node at position x will need to be compared
		// to the node at position (x-1)/2, and if the former is greater, then
		// they must be swapped.
		// this will continue until either the greatest node reaches the top of
		// the heap (where position = 0), or if the node is where it needs to be
		// (i.e its parents are greater and its children are smaller).
		position = size;
		while(position != 0) {
			// keep in mind the while loop condition is checking if the child node
			// has reached position 0 (not the parent node).
			if(heap[position] >= heap[(position-1)/2]) {
				// if the node at position x is greater than the node at position
				// (x-1)/2, then the two nodes must be swapped.
				int addTemp = 0;
				addTemp = heap[position];
				heap[position] = heap[(position-1)/2];
				heap[(position-1)/2] = addTemp;
				position = ((position-1)/2);
			} else {
				break;
			}
		}
		size++;
	}
	
	// remove method taken from arrayQueue.
	public int remove() {
		// aka pop, will remove the value at the start of the list.
		
		// this special remove method will remove the first entry in the heap, before replacing it
		// with the last element in the list shown.
		// then, the node that replaces the "head" node must be compared to its children, and must be
		// swapped with the greater node that is below it.
		// to compare a node to its children, given position x, its left child can be represented with
		// position (x * 2) + 1 and its right child can be represented with (x * 2) + 2.
		// continue until there are either no more children to compare the node with, or until there are
		// no more children that are greater than the node.
		
		recentRemoved = heap[0];
		if(size == 10) {
			heap[0] = heap[size-1];
			heap[size-1] = 0;
		} else {
			heap[0] = heap[size];
			heap[size] = 0;
		}
		
		position = 0;
		//System.out.println(position);
		//System.out.println((position * 2) + 1);
		//System.out.println(maxSize);
		while(position < size) {
			//System.out.println(size);
			// keep in mind the while loop condition is checking if the child node
			// has reached position "size" (not the parent node).
			// also keep in mind that (x * 2) + 1 is a position, while heap[(x * 2) + 1]
			// is the value in position (x * 2) + 1.
			// since we're comparing a node's child/children, there must be a check
			// to see if the node has at least 1 child to begin with.
			// there should also be a check to make sure that the position (x * 2) + 1 or
			// (x * 2) + 2 isn't greater than the maxSize.
			// keep in mind that size is the # of elements present in the heap, and that
			// maxSize is the size of the array.
			
			// print statements
			//System.out.println("left child " + ((position * 2) + 1)); /*returns 7*/
			//System.out.println("right child " + ((position * 2) + 2)); /*returns 8*/
			//System.out.println(maxSize); /*returns 10*/
			//System.out.println(size); /*returns 4*/
			//System.out.println(position); /*returns 3*/
			//System.out.println(heap[(position * 2) + 1]); /**/
			//System.out.println(heap[(position * 2) + 2]);
			
			if (((position * 2) + 1) < maxSize && ((position * 2) + 2) < maxSize) {
				//System.out.println("1");
				// check if child position is less than maxSize.
				if (heap[(position * 2) + 1] != 0 && heap[(position * 2) + 2] != 0) {
					//System.out.println("2");
					// base case: the node has both a left and a right child.
					if (heap[(position * 2) + 1] >= heap[(position * 2) + 2]) {
						//System.out.println("3");
						// the left node is greater than the right node.
						if (heap[position] <= heap[(position * 2) + 1]) {
							//System.out.println("4");
							// if the node at position x is less than the node at position
							// (x * 2) + 1, then the two nodes must be swapped.
							int removeTemp = 0;
							removeTemp = heap[position];
							heap[position] = heap[(position * 2) + 1];
							heap[(position * 2) + 1] = removeTemp;
							position = ((position * 2) + 1);
							//System.out.println((position * 2) + 1);
							// these five lines of code are running, but the heap is not printed...
						} else {
							break;
						}
					} else {
						// the right node is greater than the left node.
						//System.out.println(heap[position]);
						if (heap[position] <= heap[(position * 2) + 2]) {
							// if the node at position x is less than the node at position
							// (x * 2) + 2, then the two nodes must be swapped.
							int removeTemp = 0;
							removeTemp = heap[position];
							heap[position] = heap[(position * 2) + 2];
							heap[(position * 2) + 2] = removeTemp;
							position = ((position * 2) + 2);
						} else {
							break;
						}
					}
					// if(heap[position] >= heap[(position-1)/2]) {
							// if the node at position x is greater than the node at position
							// (x + 1) * 2, then the two nodes must be swapped.
					// 		int removeTemp = 0;=
					// 		removeTemp = heap[position];
					// 		heap[position] = heap[(position-1)/2];
					// 		heap[(position-1)/2] = removeTemp;
					// 		position = ((position-1)/2);
					// } else {
					// 		break;
					// }
				} else if (heap[(position * 2) + 1] != 0 && heap[(position * 2) + 2] == 0) {
					//System.out.println("=5");
					// the node has a left child, but not a right one.
					if (heap[position] <= heap[(position * 2) + 1]) {
						//System.out.println("=5.5");
						// if the node at position x is less than the node at position
						// (x * 2) + 1, then the two nodes must be swapped.
						int removeTemp = 0;
						removeTemp = heap[position];
						heap[position] = heap[(position * 2) + 1];
						heap[(position * 2) + 1] = removeTemp;
						position = ((position * 2) + 1);
						//System.out.println((position*2) + 1);
						//System.out.println((position*2) + 2);
					} else {
						break;
					}
				} else if (heap[(position * 2) + 2] != 0 && heap[(position * 2) + 1] == 0) {
					//System.out.println("6");
					// the node has a right child, but not a left one.
					if (heap[position] <= heap[(position * 2) + 2]) {
						// if the node at position x is less than the node at position
						// (x * 2) + 2, then the two nodes must be swapped.
						int removeTemp = 0;
						removeTemp = heap[position];
						heap[position] = heap[(position * 2) + 2];
						heap[(position * 2) + 2] = removeTemp;
						position = ((position * 2) + 2);
					} else {
						break;
					}
				} else {
					break;
				}
			} else {
				break;
			}
		}
		// recentRemoved = heap[removeAt];
		// heap[removeAt] = 0;
		// removeAt++;
		size--;
		return recentRemoved;
		// that's a lot of if statements...
	}
	
	// ifEmpty method taken from arrayStack.
	public boolean testIfEmpty() {
		// tests if the heap is empty.
		if(size == 0) {
			return true;
			//removeAt = 0;
			//recentRemoved = 0;
		} else {
			return false;
		}
	}
	
	// peak method taken from arrayQueue.
	public int giveFirstElement() {
		// aka peak, will give the entry that would be removed if the remove
		// method was called (without actually removing the entry).
		//if(removeAt > maxSize) {
		//	return 0;
		//} else {
		//	recentRemoved = heap[0];
		//	return recentRemoved;
		//}
		return heap[0];
	}
	
	// toString
	public String toString() {
		return Arrays.toString(heap);
	}
}