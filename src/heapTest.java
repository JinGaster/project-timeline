public class heapTest {
	public static void main(String[] args) {
		// creating heap with capacity 10.
		System.out.println("Creating heap...");
		heap coolHeap = new heap(10);
		System.out.println("Heap created. Beginning heap trials...");
		
		// trial 1: entering values 0 to 4 in the heap, taking up 5 slots.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 1");
		System.out.println("----------------------------------");
		for(int i = 1; i < 6; i++) {
			coolHeap.add(i);
			System.out.println(coolHeap);
		}
		System.out.println("Is this list empty: " + coolHeap.testIfEmpty());
		System.out.println("The peak of this heap is: " + coolHeap.giveFirstElement());
		
		// trial 2: removing one value in the heap.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 2");
		System.out.println("----------------------------------");
		coolHeap.remove();
		System.out.println(coolHeap);
		System.out.println("Is this list empty: " + coolHeap.testIfEmpty());
		System.out.println("The peak of this heap is: " + coolHeap.giveFirstElement());
		
		// trial 3: removing two values in the heap.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 3");
		System.out.println("----------------------------------");
		for(int i = 0; i < 2; i++) {
			coolHeap.remove();
			//System.out.println("123");
			System.out.println(coolHeap);
		}
		System.out.println("Is this list empty: " + coolHeap.testIfEmpty());
		System.out.println("The peak of this heap is: " + coolHeap.giveFirstElement());
		
		// trial 4: removing the remaining two values in the heap.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 4");
		System.out.println("----------------------------------");
		for(int i = 0; i < 2; i++) {
			coolHeap.remove();
			System.out.println(coolHeap);
		}
		System.out.println("Is this list empty: " + coolHeap.testIfEmpty());
		System.out.println("The peak of this heap is: " + coolHeap.giveFirstElement());
		
		// trial 5: filling the entire heap with elements starting at 100 and incrementing upwards.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 5");
		System.out.println("----------------------------------");
		for(int i = 0; i < 10; i++) {
			coolHeap.add(i+100);
			System.out.println(coolHeap);
		}
		System.out.println("Is this list empty: " + coolHeap.testIfEmpty());
		System.out.println("The peak of this heap is: " + coolHeap.giveFirstElement());
		
		// trial 6: emptying the list entirely.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 6");
		System.out.println("----------------------------------");
		for (int i = 0; i < 10; i++) {
			coolHeap.remove();
			System.out.println(coolHeap);
		}
		System.out.println("Is this list empty: " + coolHeap.testIfEmpty());
		System.out.println("The peak of this heap is: " + coolHeap.giveFirstElement());
	}
}