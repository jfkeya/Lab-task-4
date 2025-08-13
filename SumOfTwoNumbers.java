import java.util.Scanner;

public class SumOfTwoNumbers { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask for second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate sum
        double sum = num1 + num2;

        // Print result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}