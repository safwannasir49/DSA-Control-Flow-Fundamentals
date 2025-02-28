import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        long n = sc.nextInt();
        int is_prime = 1;
        for(int i = 2;i<=n/2;i++)
        {
            if(n%i==0){
                is_prime = 0;
            }
        }
        
        if(is_prime == 1)
        {
            System.out.println(n+ " is a Prime Number.");
        }
        else{
        System.out.println(n+ " is not a Prime Number.");
        
            
        }
    }
 }
