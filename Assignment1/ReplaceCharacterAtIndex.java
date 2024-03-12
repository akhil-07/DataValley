// write  a java program to Replace a character at a specific index in a String in Java.

package Assignment1;
import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the original string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter the index value: ");
        int index = scanner.nextInt();
        
        System.out.print("Enter the character: ");
        String replacementChar = scanner.next();
        char character = replacementChar.charAt(0);

        char[] chars = str.toCharArray();
        chars[index] = character; 

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + new String(chars));
        
    }
}