// Write a Java program that includes a method divideNumbers(int numerator, int denominator) to perform division. Implement exception handling to catch ArithmeticException if the denominator is zero and display an appropriate error message.

package Assignment1;
import java.util.*;
public class DivisionProgram {
    public static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error Message: Division by zero is not allowed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt(); 
        divideNumbers(numerator, denominator);
    }
}