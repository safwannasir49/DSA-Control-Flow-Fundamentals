import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        long base = sc.nextInt();
        System.out.println("Enter the Power: ");
        long power = sc.nextInt();
        long result =1;
        for(int i = 1;i<=power;i++){
            result = result * base;
        }
        System.out.println("Result: "+result);
    }
}
