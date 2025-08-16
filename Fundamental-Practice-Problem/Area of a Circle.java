public class CircleArea {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the radius as a command-line argument.");
            return;
        }
        double radius = Double.parseDouble(args[0]);
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}