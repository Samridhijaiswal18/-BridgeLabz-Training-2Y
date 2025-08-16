<<<<<<< HEAD
import java.io.BufferedReader;
=======
7import java.io.BufferedReader;
>>>>>>> b25e9a8 ([Raghuraj] added- Core-Practice-Problem)
import java.io.InputStreamReader;
import java.io.IOException;

public class SumCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(reader.readLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(reader.readLine());

        double sum = num1 + num2;

        System.out.println("The sum of the two numbers is: " + sum);
    }
}
