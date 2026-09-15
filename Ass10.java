import java.util.Scanner;

class Ass10 {
	static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	static void addMatrix(int[][] first, int[][] second) {
		int[][] result = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = first[i][j] + second[i][j];
			}
		}

		displayMatrix(result);
	}

	static void subtractMatrix(int[][] first, int[][] second) {
		int[][] result = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = first[i][j] - second[i][j];
			}
		}

		displayMatrix(result);
	}

	static void multiplyMatrix(int[][] first, int[][] second) {
		int[][] result = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					result[i][j] += first[i][k] * second[k][j];
				}
			}
		}

		displayMatrix(result);
	}

	static void transposeMatrix(int[][] matrix) {
		int[][] transpose = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		displayMatrix(transpose);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] first = new int[3][3];
		int[][] second = new int[3][3];

		System.out.println("Enter elements  matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				first[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter elements of the matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				second[i][j] = scanner.nextInt();
			}
		}

		System.out.println("\n1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Transpose of  matrix");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();

		System.out.println("Result:");
		switch (choice) {
			case 1:
				addMatrix(first, second);
				break;
			case 2:
				subtractMatrix(first, second);
				break;
			case 3:
				multiplyMatrix(first, second);
				break;
			case 4:
				transposeMatrix(first);
				break;
			default:
				System.out.println("Invalid choice.");
		}

	}
}
