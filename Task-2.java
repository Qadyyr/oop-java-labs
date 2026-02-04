import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number to check whether it is even or odd: ");
        int a = sc.nextInt();
        
        if (a % 2 == 0) {
            System.out.print(a + " is Even");
        } else {
            System.out.print(a + " is Odd");
        }
        
        sc.close();
    }
}
