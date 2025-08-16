public class RectanglePerimeter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the length and width as command-line arguments.");
            return;
        }
        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}