// Create a custom exception class in Java named CustomValidationException. Implement a method that takes an integer as input and throws this custom exception if the number is negative 

package Assignment1;
import java.util.*;
class CustomValidException extends Exception {
    public CustomValidException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number: ");
            int number = sc.nextInt(); 
            if (number < 0) {
                throw new CustomValidException("Number cannot be negative");
            }
            System.out.println("Number is valid: " + number);
        } catch (CustomValidException e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}