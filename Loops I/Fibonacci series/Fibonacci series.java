import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Terms: ");
        long n = sc.nextInt();
        int series;
        for(int i = 1;i<=n;i++){
        series = fibbonacci(i);
        System.out.print(series+ " ");
        }
    }
    
    static int fibbonacci(int fib)
    {
        if(fib == 0)
        {
            return 0;
        }
        if(fib == 1)
        {
            return 1;
        }
        
        return fibbonacci(fib-1) + fibbonacci(fib-2);
    }
}
