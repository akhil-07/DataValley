package Assignment6;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers. Enter '0' to finish.");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;

            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        }

        scanner.close();
    }
}

