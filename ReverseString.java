 
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text: ");
        String s = sc.nextLine();
        
        System.out.println("Reversed: " + new StringBuilder(s).reverse());
    }
}
