import java.util.Scanner;
public class question5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        scanner.close();
    }
}
