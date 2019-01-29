package DimentionalArray;

public class JavaTwoDimArray {
	public static void main(String[] args) {
		int[][] TwoDim = new int[4][3];
//assign temporary variable
		int temp = 10;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				TwoDim[i][j] = temp;
				// increase temp variable value ++
				temp += 10;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(TwoDim[i][j] + " ");
			}
			// empty line
			System.out.println();
		}
	}
}
