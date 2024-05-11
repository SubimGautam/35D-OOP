import java.util.Scanner;
public class question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int firstnumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondnumber = scanner.nextInt();
        
        int sum = firstnumber + secondnumber;

        int product = firstnumber * secondnumber;

        int division = product/sum;
        System.out.println("Sum of two number is"+ sum);
        System.out.println("product of two number is"+ product);
        System.out.println("Division of product and sum is"+ division);
    }
}