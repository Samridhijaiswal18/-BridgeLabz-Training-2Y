public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the temperature in Celsius as a command-line argument.");
            return;
        }

        double celsius = Double.parseDouble(args[0]);
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }
}
