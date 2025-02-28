import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int product = 1;
        int digit = n;
        while(n !=0)
        {
            digit = n%10;
            product = product * digit;
            n = n/10;
        }
        System.out.println(product);
    }
}
