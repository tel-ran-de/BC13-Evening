public class House {
    public static void main(String[] args) {
        double woodPrice = getMeWoodPrice();
        double cranePrice = getMeCranePrice();
        double workerPrice = getMeWorkPrice();
        double paintPrice = getMePaintPrice();
        double totalCoast = woodPrice + cranePrice + workerPrice + paintPrice;
        System.out.println("Стоимость дома   " + totalCoast + '$');
    }

    private static double getMePaintPrice() {
        return 0;
    }

    private static double getMeWorkPrice() {
        return 0;
    }

    private static double getMeCranePrice() {
        return 0;
    }

    private static double getMeWoodPrice() {
        double houseLength = 12.0; //Метров
        double houseWidth = 11.0; //Метров
        double houseHeight = 3.0; //Метров
        double barHeight = 0.2; //Метров
        double barLength = 6.0; //Метров
        double barWidth = 0.2; //Метров
        double barCubPrice = 250.0; //Цена $
        double squareHouse = houseHeight * (houseLength + houseWidth) * 2;
        double woodVolumen = squareHouse * barWidth;
        double price = woodVolumen * barCubPrice;

        return price;
    }

}
