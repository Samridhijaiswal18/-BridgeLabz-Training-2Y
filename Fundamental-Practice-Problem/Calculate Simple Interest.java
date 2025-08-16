public class SimpleInterest {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide Principal, Rate, and Time as command-line arguments.");
            return;
        }
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}