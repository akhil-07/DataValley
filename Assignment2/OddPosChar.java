package Assignment2;

public class OddPosChar {
    public static void main(String[] args) {
        String text = "type here to search";
        text = text.replaceAll(" ", "");
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(text.charAt(i) + " ");
            }
        }
    }
    
}
