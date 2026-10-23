import java.util.Scanner;

class EvenOdd extends Thread {
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

class Table implements Runnable {
    int n;

    Table(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}


public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        EvenOdd t1 = new EvenOdd();
        Thread t2 = new Thread(new Table(n));

        t1.start();
        t2.start();

        sc.close();
    }
}
