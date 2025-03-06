import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the No of Rows: ");
            int n = sc.nextInt();
            System.out.println();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

/* Output:

Enter the No of Rows: 
7

*******
*******
*******
*******
*******
*******
*******

*/
