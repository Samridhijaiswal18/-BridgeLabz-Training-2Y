import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1 & 2: Create StringBuilder and append string
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        // Step 3: Reverse the string
        sb.reverse();

        // Step 4: Convert back to string
        String reversed = sb.toString();

        System.out.println("Reversed string: " + reversed);
    }
}
