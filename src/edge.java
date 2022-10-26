public class edge {
	private vertex vertex1;
    private vertex vertex2;
    private int weight;
    // creation of important stuff
    
 	public edge(vertex x, vertex y, int w){
 		this.vertex1 = x;
 		this.vertex2 = y;
 		this.weight = w;
    }
 	// constructor
 	
 	public vertex getVertex1() {
 		return vertex1;
 	}
    public vertex getVertex2() {
     	return vertex2;
    }
	public int getWeight() {
		return weight;
	}
	// getters
}