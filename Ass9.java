import java.util.Arrays;
import java.util.Scanner;

public class Ass9 {
	static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[smallest]) {
					smallest = j;
				}
			}

			int temp = array[i];
			array[i] = array[smallest];
			array[smallest] = temp;
		}
	}

	static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > current) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("\n1. Bubble Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Insertion Sort");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();

		switch (choice) {
			case 1:
				bubbleSort(array);
				break;
			case 2:
				selectionSort(array);
				break;
			case 3:
				insertionSort(array);
				break;
			default:
				System.out.println("Invalid choice.");

				return;
		}

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

	}
}
