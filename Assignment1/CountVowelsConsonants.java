// write a java program to count the number of vowels and consonants in a given string .

package Assignment1; 
import java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int[] counts = countVowelsConsonants(str.toLowerCase()); 
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    public static int[] countVowelsConsonants(String str) {
        int[] counts = new int[2]; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[0]++; 
                } else {
                    counts[1]++; 
                }
            }
        }
        return counts;
    }
}