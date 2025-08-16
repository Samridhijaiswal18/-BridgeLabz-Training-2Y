public class KmToMiles {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the distance in kilometers as a command-line argument.");
            return;
        }
        double kilometers = Double.parseDouble(args[0]);
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
    }
}