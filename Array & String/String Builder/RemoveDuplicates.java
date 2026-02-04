import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Create StringBuilder and HashSet
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Step 2: Iterate through characters
        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        // Step 3: Convert to string
        System.out.println("String without duplicates: " + result.toString());
    }
}
