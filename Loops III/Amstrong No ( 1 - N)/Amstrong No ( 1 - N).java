import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Upper Limit: ");
        int n = sc.nextInt();
        
        System.out.print("Armstrong Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num, digit, count = 0;
        double armstrong = 0;
        
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            armstrong += Math.pow(digit, count);
            temp /= 10;
        }

        return original == armstrong;
    }
}
