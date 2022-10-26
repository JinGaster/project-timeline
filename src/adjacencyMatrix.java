public class adjacencyMatrix {
	private double[][] graphMatrix;
	private double weight;
	// creating array
	
	public adjacencyMatrix(int x, int y){
		if(x >= y) {
			this.graphMatrix = new double[x][x];
		}
		else {
			this.graphMatrix = new double[y][y];
		}
    }
	// constructor (must be a square array)
	
	public void fill() {
		for(int r = 0; r < graphMatrix.length; r++) {
			for(int c = 0; c < graphMatrix.length; c++) {
				graphMatrix[r][c] = 1.0/0.0;
			}
		}
	}
	// set each and every value to inf
	
	// given a graph with different vertices attached to each other via edges,
	// make a two dimensional array where the rows and columns intersect into
	// either 0 or 1, depending on if the vertices are attached.
	
	public void setGraphMatrix(int x, int y, double w) {
		graphMatrix[x][y] = w;
		//graphMatrix[y][x] = 1;
		// set array [x][y] and [y][x] to 1.
	}
	
	public void printGraphMatrix() {
		for(int r = 0; r < graphMatrix.length; r++) {
			String graph = "[";
			for(int c = 0; c < graphMatrix.length; c++) {
				graph += graphMatrix[r][c] + ", ";
			}
			System.out.println(graph.substring(0, graph.length()-2) + "]");
		}
	}
}