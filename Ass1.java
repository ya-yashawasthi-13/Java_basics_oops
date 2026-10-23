import java.util.Scanner;
class Ass1 {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("Please enter a valid 5-digit number.");
            return;
        }

        int[] digits = new int[5];

        // Store digits in array
        for (int i = 4; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }

        int largest = digits[0];
        int secondLargest = digits[0];
        int smallest = digits[0];
        int secondSmallest = digits[0];

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }

            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest) {
                secondSmallest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);
    }
}