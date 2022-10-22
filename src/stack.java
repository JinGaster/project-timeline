import java.util.ArrayList;
public class stack {
	private ArrayList < Integer > epicStack = new ArrayList < Integer > ();
	public stack() {
	}
	public void add(int data) {
		epicStack.add(data);
	}
	public void remove(int data) {
		epicStack.remove(data);
	}
	//when adding, add to the end of the list, in a sequential set of integers; (1, 2, 3, 4, 5, 6, 7)
	//when removing, remove from the end of the list; (1, 2, 3, 4, 5)
}
