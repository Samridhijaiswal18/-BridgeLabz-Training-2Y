import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights
        System.out.println("Enter heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
        }

        // Calculate sum
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display mean height
        System.out.println("\nMean height of the football team = " + mean);

        sc.close();
    }
}
