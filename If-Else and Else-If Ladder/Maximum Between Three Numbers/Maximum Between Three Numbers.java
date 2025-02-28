import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Values:");
        int n = sc.nextInt();
        
        if(n == 3) {
            System.out.println("Enter the First Value:");
            int n1 = sc.nextInt();
            System.out.println("Enter the Second Value:");
            int n2 = sc.nextInt();
            System.out.println("Enter the Third Value:");
            int n3 = sc.nextInt();
            
            int maxnum = Math.max(n1, Math.max(n2, n3));
            System.out.println(maxnum + " is Largest");
        } 
        else if(n > 3) {
            System.out.println("Enter " + n + " Values:");
            int maxnum = Integer.MIN_VALUE;
            for(int i = 1; i <= n; i++) {
                int value = sc.nextInt();
                maxnum = Math.max(maxnum, value);
            }
            System.out.println("Maximum Value: " + maxnum);
        } 
        else {
            System.out.println("Enter a Minimum of 3 values");
        }
    }
}
