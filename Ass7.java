import java.util.Arrays;
import java.util.Scanner;

class Ass8{
	int linearSearch(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	int binarySearch(int[] array, int value) {
		int first = 0;
		int last = array.length - 1;

		while (first <= last) {
			int middle = first + (last - first) / 2;

			if (array[middle] == value) {
				return middle;
			} else if (array[middle] < value) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
		}
		return -1;
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

		System.out.print("Enter the element to search: ");
		int value = scanner.nextInt();

		System.out.println("1. Linear Search");
		System.out.println("2. Binary Search");
		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();

		int position;

		switch (choice) {
			case 1:
				position = linearSearch(array, value);
				if (position == -1) {
					System.out.println("Element not found.");
				} else {
					System.out.println("Element found at position " + (position + 1));
				}
				break;

			case 2:
				Arrays.sort(array);
				System.out.println("Sorted array: " + Arrays.toString(array));
				position = binarySearch(array, value);
				if (position == -1) {
					System.out.println("Element not found.");
				} else {
					System.out.println("Element found at position " + (position + 1)
							+ " in the sorted array.");
				}
				break;

			default:
				System.out.println("Invalid choice.");
		}

	}
}
