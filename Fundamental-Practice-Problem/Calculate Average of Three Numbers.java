public class AverageOfThree {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three numbers as command-line arguments.");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }
}