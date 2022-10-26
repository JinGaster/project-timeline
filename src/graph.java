public class graph {
	hashmap<Integer, vertex> graphHash = new hashmap();
	int size = 0;
	int edgeSize = 0;
	vertex newVertex;
	int edgeCount;
	// node = vertex, connected w/ connections between nodes
	// nodes do not have to be connected
	// every node has an ID that stores data and adj node
	// two ways to represent graphs, differing ways to program
	// - adj. matrix or list
	// - object oriented (using nodes)
	// can add vertices
	// graph stores vertices and connections, stores via hashmap
	
	public void addVertex(int i, int d) {
		// addVertex adds a vertex that is stored in a hashmap.
		newVertex = new vertex(i, d, false);
		graphHash.add(i, newVertex);
		graphHash.getData(i);
		size++;
	}
	
	public void createEdge(int x, int y, int w) {
		// createEdge creates an edge that connects two vertices
		// that were inputed as parameters.
		// it does this by taking the two vertex IDs and connecting them.
		
		edge newEdge = new edge(graphHash.getValue(x), graphHash.getValue(y), w);
		newEdge.getVertex1().addEdge(newEdge);
		//newEdge.getVertex2().addEdge(newEdge);
		edgeSize++;
	}
	
	// check if two vertices are connected.
	public boolean checkIfConnected(int x, int y) {
		return graphHash.getValue(x).trueIfConnected(graphHash.getValue(x), graphHash.getValue(y));
		// runs a function in vertex.java
	}
	
	// prints the graph as an adjacency list.
	public void printGraph1() {
		for(int i = 0; i < size; i++) {
			// step 1: setting defaults.
			String graph = "";
			int edgeWeight;
			edgeCount = graphHash.getValue(i).returnEdges().size();
			graph += "The vertex " + graphHash.getValue(i) + " is attached to these vertices: [";
			
			// step 2: adding to "graph" with the vertices that it is attached to.
			if(graphHash.getValue(i).returnEdges() != null) {
				for(int j = 0; j < edgeCount; j++) {
					if(graphHash.getValue(i).returnEdges().get(j).getVertex1() == graphHash.getValue(i)) {
						// the first vertex, 0, has no edges, so the code will break if it tries to name
						// those edges.
						graph += graphHash.getValue(i).returnEdges().get(j).getVertex2();
						edgeWeight = graphHash.getValue(i).returnEdges().get(j).getWeight();
						graph += " (weight of " + edgeWeight + ")";
						graph += ", ";
					}
					else if(graphHash.getValue(i).returnEdges().get(j).getVertex2() == graphHash.getValue(i)) {
						graph += graphHash.getValue(i).returnEdges().get(j).getVertex1();
						edgeWeight = graphHash.getValue(i).returnEdges().get(j).getWeight();
						graph += " (weight of " + edgeWeight + ")";
						graph += ", ";
					}
				}
			}
			
			// step 3: preparing "graph" to be sent out as a system message.
			if(graph != "") {
				//System.out.println(graphHash.getValue(i).returnEdges());
				if(graphHash.getValue(i).returnEdges().size() == 0) {
					// if the list of adjacent vertices is empty, print out "[]".
					System.out.println(graph + "]");
				}
				else {
					// otherwise, print out the adjacent vertices, and end with a closing bracket.
					// this fancy ".substring" technique will remove any unneeded commas.
					System.out.println(graph.substring(0, graph.length()-2) + "]");
				}
			}
			// step 4: repeat until the for loop has printed out every vertex and its adjacent vertices.
		}
	}
	
	// requires stacks
	public boolean checkIfConnected2(int x, int y) {
		// aka DFS, this takes two IDs and returns if they are connected (they can have a middle-man node).
		// this is done by reading the graph from one way top to bottom, then going back to find another way.
		
		// start at one node, find all connected nodes, add them to a stack, mark node on as visited, go to the
		// first element on stack -> look at all nodes connected that haven't been marked as visited, add them to
		// stack, keep doing it until the stack is empty
		
		// step 1: setting defaults
		arrayStack<vertex> graphStack = new arrayStack(size);
		
		System.out.println("----------------------------------");
		System.out.println("SIZE: " + size);
		System.out.println("----------------------------------");
		
		vertex vertexTraversal = graphHash.getValue(x);
		edgeCount = graphHash.getValue(vertexTraversal.getId()).returnEdges().size();
		boolean foundTheTwentyFifthLetterOfTheAlphabet = false;
		
		// step 2: do the thing
		graphStack.add(vertexTraversal);
		while(graphStack.testIfEmpty() != true) {
			
			System.out.println("GRAPH STACK SIZE: " + graphStack.findSize());
			
			vertexTraversal = graphStack.remove();
			
			System.out.println("VERTEX TRAVERSAL: " + graphStack.giveFirstElement());
			
			if(graphHash.getValue(vertexTraversal.getId()).returnEdges().size() != 0) {
				edgeCount = graphHash.getValue(vertexTraversal.getId()).returnEdges().size();
			}
			else {
				break;
			}
			for(int i = 0; i < edgeCount; i++) {
				
				// print statement facility v2
				System.out.println("EDGE COUNT: " + edgeCount);
				System.out.println("GRAPH STACK SIZE: " + graphStack.findSize());
				System.out.println("GRAPH STACK FIRST ELEMENT: " + graphStack.giveFirstElement());
				
				if(vertexTraversal.returnEdges() != null) {
					if(vertexTraversal.returnEdges().get(i).getVertex2().getId() == y) {
						foundTheTwentyFifthLetterOfTheAlphabet = true;
					}
					if(vertexTraversal.returnEdges().get(i).getVertex2().returnStatus() != true) {
						graphStack.add(vertexTraversal.returnEdges().get(i).getVertex2());
					}
				}
				else {
					break;
				}
			}
			vertexTraversal.markTrue();
			
			System.out.println("GRAPH STACK SIZE: " + graphStack.findSize());
			System.out.println("STACK LIST: " + graphStack);
			System.out.println("----------------------------------");
			
		}
		
		// step 3: return true or false, depending on whether or not the DFS scan has found the vertex y.
		if(foundTheTwentyFifthLetterOfTheAlphabet == true) {
			return true;
		}
		else {
			return false;
			// placeholder
		}
	}
	
	// returns size
	public int returnSize() {
		return size;
	}
	
	// returns edge size
	public int returnNumberOfEdges() {
		return edgeSize;
	}
}