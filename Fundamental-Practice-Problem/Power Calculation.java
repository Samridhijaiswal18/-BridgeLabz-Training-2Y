public class PowerCalculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the base and exponent as command-line arguments.");
            return;
        }
        double base = Double.parseDouble(args[0]);
        double exponent = Double.parseDouble(args[1]);
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}