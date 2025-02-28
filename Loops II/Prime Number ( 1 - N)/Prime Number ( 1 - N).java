import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Upper Limit: ");
        long n = sc.nextInt();
        System.out.print("Prime Number's (1-N) are: ");
        for(int i = 2;i<=n;i++)
        {
            if(is_prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean is_prime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
 }
