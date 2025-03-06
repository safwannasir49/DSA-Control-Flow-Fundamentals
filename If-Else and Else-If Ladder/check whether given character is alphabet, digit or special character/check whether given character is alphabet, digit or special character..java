import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if((ch>='A'&& ch<='Z') || (ch>='a'&& ch<='z')){
         System.out.println(ch + " is a Charecter.");
        }
        else if(ch>='0'&& ch<='9'){
            System.out.println(ch + " is a Digit.");
        }else{
            System.out.println(ch+ " is Special Charecter.");
        }
        sc.close();
    }
}
