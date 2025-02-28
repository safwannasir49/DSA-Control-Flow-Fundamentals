import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Upper Limit: ");
        long n = sc.nextInt();
        System.out.print("Prime factor's (1-N) are: ");
        for(int i = 2;i<=n;i++)
        {
            if(n%i==0 && isprime(i)){
                System.out.print(i+" ");
                n = n/i;
            }
        }
    }
    
    public static boolean isprime(int num)
    {
        if(num<2){
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
