import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 , side2, side3;
        System.out.println("To determine the Triangle");
        System.out.println("Enter Side 1: ");
        side1 = sc.nextInt();
        System.out.println("Enter Side 2: ");
        side2 = sc.nextInt();
        System.out.println("Enter Side 3: ");
        side3 = sc.nextInt();
        if((side1==side2) && (side2==side3) && (side3==side1)){
            System.out.println("Equilateral Triangle.");
        }
        else if((side1 == side2) || (side2 == side3) || (side1 == side3)){
            System.out.println("Isosceles Triangle.");
        }else{
            System.out.println("Scalene Triangle.");
        }
    }
}

