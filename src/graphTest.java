public class graphTest {
	public static void main(String[] args) {
		// trial 0: creating graph and setting defaults.
		System.out.println("Creating graph...");
		graph epicGraph = new graph();
		
		// trial 1: entering vertices 0 to 5 in the graph.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 1");
		System.out.println("----------------------------------");
		for(int i = 0; i < 5; i++) {
			epicGraph.addVertex(i, i);
		}
		System.out.println("Vertex count: " + epicGraph.returnSize());
		System.out.println("Edge count: " + epicGraph.returnNumberOfEdges());
		
		// trial 2: adding an edge that connects 2 -> 4.
		//          adding an edge that connects 3 -> 1.
		//          adding an edge that connects 1 -> 2.
		// (creating an edge used to make it so they were connected to
		//  each other)
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 2");
		System.out.println("----------------------------------");
		epicGraph.createEdge(2, 3, 5);
		epicGraph.createEdge(3, 1, 2);
		epicGraph.createEdge(1, 2, 1);
		System.out.println("Vertex count: " + epicGraph.returnSize());
		System.out.println("Edge count: " + epicGraph.returnNumberOfEdges());
		
		// trial 3: check if vertices 3 and 1 are connected.
		//          check if vertices 2 and 3 are connected.
		// (in this method, "connected" means adjacent.)
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 3");
		System.out.println("----------------------------------");
		System.out.println("Vertex count: " + epicGraph.returnSize());
		System.out.println("Edge count: " + epicGraph.returnNumberOfEdges());
		System.out.println(epicGraph.checkIfConnected(3, 1)); //true
		System.out.println(epicGraph.checkIfConnected(2, 3)); //false
		
		// trial 4: print the graph as an adjacency list.
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 4");
		System.out.println("----------------------------------");
		epicGraph.printGraph1();
		
		// trial 5: test if two vertices are connected.
		// (in this method, "connected" doesn't have to mean adjacent.)
		System.out.println("----------------------------------");
		System.out.println("             TRIAL 5");
		System.out.println("----------------------------------");
		System.out.println(epicGraph.checkIfConnected2(3, 1)); // returns true
		System.out.println(epicGraph.checkIfConnected2(2, 3)); // returns false
		System.out.println(epicGraph.checkIfConnected2(1, 3)); // returns false
		System.out.println(epicGraph.checkIfConnected2(3, 2)); // should return true,
		System.out.println(epicGraph.checkIfConnected2(3, 4)); // should return true,
	}
}