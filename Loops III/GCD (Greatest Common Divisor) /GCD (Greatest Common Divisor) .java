import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int gcd = numbers[0];
        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }

        System.out.println("GCD of the given numbers: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
