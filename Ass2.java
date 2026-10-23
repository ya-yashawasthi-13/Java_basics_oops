import java.util.Scanner;

class Ass2 {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of X: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }

        System.out.println("Sum of the series = " + sum);
    }
}