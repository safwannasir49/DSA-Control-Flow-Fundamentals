import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int max = Math.max(n1, Math.max(n2, n3)); 
        System.out.println("Maximum among all three numbers is: " + max);
        
        sc.close();
    }
}
