import java.util.ArrayList;

public class vertex {
	// stores an id, data
	// will also store adj. vertices
	int arrayLinkSize = 0;
	int edgeSize = 0;
	
	ArrayList<edge> arrayLink = new ArrayList<edge>();
	// arrayList will store the multiple edges each vertex will have.
	
	private int id;
    private int data;
    private boolean hasFound;
    // creation of important stuff
    
	public vertex(int i, int d, boolean b){
		this.id = i;
        this.data = d;
        this.hasFound = b;
    }
	// constructor
	
	public boolean trueIfConnected(vertex x, vertex y) {
		for(int i = 0; i < arrayLinkSize; i++) {
			if(arrayLink.get(i).getVertex1() == x) {
				if(arrayLink.get(i).getVertex2() == y) {
					return true;
				}
			}
			if(arrayLink.get(i).getVertex2() == x) {
				if(arrayLink.get(i).getVertex1() == y) {
					return true;
				}
			}
		}
		return false;
	}
	// return if two vertices are adjacent.
	
	public ArrayList<edge> returnEdges() {
		return arrayLink;
	}
	// returns arrayList of edges.
	
	public void addEdge(edge e) {
		arrayLink.add(e);
		arrayLinkSize++;
	}
	// adds an edge.
	
	public void markTrue() {
		hasFound = true;
	}
	public void markFalse() {
		hasFound = false;
	}
	public boolean returnStatus() {
		return hasFound;
	}
	// sets a vertex's status to "found" or "not found", used in DFS.
	// also returns the vertex status if needed.
	
	public int getId() {
		return id;
	}
    public int getData() {
    	return data;
    }
    // getters
    
 	public String toString() {
 		String temp = "VertexWithId" + this.getId();
 		return temp;
 	}
 	// toString
}