
public class hollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 0; a < 5; a++) {
			System.out.print(" ");
		}
		System.out.println("X");
		for(int x = 1; x < 5; x++) {
			for(int y = 6; y > (x+1); y--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for(int z = 0; z < x+2; z++) {
				System.out.print(" ");
			}
			System.out.println("X");
		}
		for(int b = 0; b < 6; b++) {
			System.out.print("X");
			System.out.print(" ");
		}
	}
}
