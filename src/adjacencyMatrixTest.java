public class adjacencyMatrixTest {
	public static void main(String[] args) {
		adjacencyMatrix funnyMatrix = new adjacencyMatrix(5, 5);
		funnyMatrix.fill();
		funnyMatrix.setGraphMatrix(2, 0, 4);
		funnyMatrix.setGraphMatrix(1, 2, 9);
		funnyMatrix.setGraphMatrix(4, 3, 2);
		funnyMatrix.setGraphMatrix(3, 4, 6);
		funnyMatrix.setGraphMatrix(0, 1, 10);
		funnyMatrix.setGraphMatrix(0, 3, 0);
		funnyMatrix.printGraphMatrix();
	}
}