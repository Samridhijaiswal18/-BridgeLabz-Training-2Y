import java.util.Scanner;

public class WordSearchLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of sentences
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        // Input sentences
        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        // Input word to search
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        // Linear search
        String result = "Not Found";

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                result = sentence;
                break;
            }
        }

        System.out.println("Result: " + result);
    }
}
