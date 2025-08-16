public class CylinderVolume {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the radius and height as command-line arguments.");
            return;
        }
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}