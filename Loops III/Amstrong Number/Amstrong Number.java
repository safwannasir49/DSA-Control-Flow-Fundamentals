import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be Checked for Amstrong: ");
        int n = sc.nextInt();
        int digit;
        double amstrong =0;
        int original = n;
        while(n!=0)
        {
            digit = n%10;
            amstrong = amstrong +  Math.pow(digit,3);
            n = n/10;
        }
        if(original == amstrong)
        {
            System.out.println(amstrong+ " is an Amstrong No.");
        }else{
            System.out.println(original+ " is not an Amstrong No.");
        }
    }
}
