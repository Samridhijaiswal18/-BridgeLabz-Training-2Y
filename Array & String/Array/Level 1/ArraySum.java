import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop for input
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Stop if 0 or negative
            if (num <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                break;
            }

            // Store number
            arr[index] = num;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        // Display total
        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}
