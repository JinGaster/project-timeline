import java.util.ArrayList;
public class queue {
	private ArrayList < Integer > epicQueue = new ArrayList < Integer > ();
	public queue() {
		
	}
	public void add(int data) {
		epicQueue.add(data);
	}
	public void remove(int data) {
		epicQueue.remove(0);
	}
	//when adding, add to the end of the list, in a sequential set of integers; (1, 2, 3, 4, 5, 6, 7)
	//when removing, remove from the FRONT of the list; (3, 4, 5, 6, 7)
}