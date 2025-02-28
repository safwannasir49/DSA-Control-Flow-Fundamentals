import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int first,last;
        last = n%10;
        first = n;
        while(first>=10)
        {
            first = first/10;
        }
        System.out.println("Sum = "+  (last + first));
    }
}
