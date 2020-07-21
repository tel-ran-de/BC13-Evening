public class DoorsAndWindows {
    static double doorsMeterPrice = 120.0;
    static double windowsMeterPrice = 100.0;
    static double ramePriceProMeter = 100.0;

    public static void main(String[] args) {
        System.out.println("Цена материала " + (doorsPrice(3) + windowsPrice(5, 2, 3)));
    }

    public static double windowsPrice(int countWindows, double height, double width) {
        return oneWindowPrice(height, width) * countWindows;
    }

    public static double doorsPrice(int countDoors) {
        return oneDoorPrice() * countDoors;
    }

    private static double oneDoorPrice() {
        double perimeterDoors = (2.0 + 0.9) * 2;
        double squareDoors = 2.0 * 0.9;
        return perimeterDoors * ramePriceProMeter + squareDoors * doorsMeterPrice;
    }

    private static double oneWindowPrice(double height, double width) {
        double perimeterWindows = (height + width) * 2;
        double squareWindows = height * width;
        return perimeterWindows * ramePriceProMeter + squareWindows * windowsMeterPrice;
    }
}
