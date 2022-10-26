import java.util.Arrays;

public class arrayQueue {
	// setting defaults
	String[] arrayQueue;
	int listEndPos = 0;
	String recentRemoved = "0";
	int removeAt = 0;
	int pointerPos = 0;
	
	public arrayQueue(int capacity){
		arrayQueue = new String[capacity];
	}
	
	public void add(String value) {
		// sets default of pointer position, which is at the beginning of the queue.
		pointerPos = 0;
		// aka push, will add a value at the end of the list.
		// (don't forget to check if the entries before are open.)
		if(removeAt > listEndPos) {
			// if the list is empty, place the value at the beginning of the list again.
			arrayQueue[0] = value;
			removeAt = 0;
			listEndPos = 0;
		}
		else {
			// if the list is not empty, run through the if statements determining where it should go.
			// test if the position at the end of the list is valid.
			if(arrayQueue[listEndPos] == null) {
				arrayQueue[listEndPos] = value;
			}
			// if not, test if the beginning of the queue is valid.
			else if(arrayQueue[pointerPos] == null) {
				arrayQueue[pointerPos] = value;
			}
			else {
				// if not, go through the queue to find a valid spot, then place the entry.
				while(arrayQueue[pointerPos] != null) {
					//System.out.println(pointerPos);
					pointerPos++;
				}
				arrayQueue[pointerPos] = value;
			}
		}
		listEndPos++;
		// keep listEndPos at a max value of 24 so it doesn't break.
		if(listEndPos > 24) {
			listEndPos = 24;
		}
	}
	
	public String remove() {
		// aka pop, will remove the value at the START of the list.
		//if(listEndPos == 0) {
		//	recentRemoved = arrayQueue[0];
		//	arrayQueue[listEndPos] = null;
		//}
		//else {
		//	recentRemoved = arrayQueue[listEndPos-1];
		//	arrayQueue[listEndPos-1] = null;
		//}
		
		// removes the entry in the list at a position determined by removeAt, starts at
		// 0 and goes up by 1 every time an entry is removed.
		recentRemoved = arrayQueue[removeAt];
		arrayQueue[removeAt] = null;
		removeAt++;
		return recentRemoved;
	}
	
	// this method returns the size of the queue.
	public int findSize() {
		return listEndPos - removeAt;
	}
	
	// this method returns whether or not the queue is empty.
	public boolean testIfEmpty() {
		if(removeAt > listEndPos) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// this method returns the entry that would have been deleted if the "remove" method was
	// called, without actually removing it.
	public String giveFirstElement() {
		// aka peak
		//if(listEndPos == 0) {
		//	recentRemoved = arrayQueue[0];
		//}
		//else if(listEndPos == -1) {
		//	recentRemoved = "0";
		//}
		//else {
		//	recentRemoved = arrayQueue[listEndPos-1];
		//}
		if(removeAt > 24) {
			return null;
		}
		else {
			recentRemoved = arrayQueue[removeAt];
			return recentRemoved;
		}
	}
	
	// toString
	public String toString() {
		//String temp = "";
		//for(int i = 0; i < listEndPos; i++) {
		//	temp += "value of " + arrayQueue[i] + " and position of " + i + "  ->  ";
		//}
		//temp += "end of list.";
		return Arrays.toString(arrayQueue);
	}
}