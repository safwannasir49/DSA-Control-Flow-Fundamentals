import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int originalno = n;
        int palindrome = 0;
        int digit = n;
        while(n !=0)
        {
            digit = n%10;
            palindrome = digit + (palindrome * 10);
            n = n/10;
        }
        if(palindrome == originalno)
        {
            System.out.println(originalno +" is Palindrome.");
        }else{
        System.out.println(originalno +" is Not Palindrome.");
        System.out.println("Since "palindrome + " !=  " + originalno);
        }
    }
}
