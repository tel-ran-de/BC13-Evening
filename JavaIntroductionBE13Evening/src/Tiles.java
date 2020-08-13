public class Tiles {
    static final double PRICE_PER_METER = 27;

    public static void main(String[] args) {
        double roomWidth = 5.5;
        double roomLength = 6.5;
        double tilesPrice = 1.5;
        application(roomWidth, roomLength, tilesPrice);
    }

    private static void application(double roomWidth, double roomLength, double tilesPrice) {
        double roomArea = roomLength * roomWidth;
        roomLength = roomLength * 100;
        roomWidth = roomWidth * 100;
        int tilesLength = 30;
        int tilesWidth = 20;
        double handWorkPrice = getMeHandWorkPrice(roomArea);
        int tilesCount = countTiles(roomWidth, roomLength, tilesWidth, tilesLength);
        double materialCost = getMeMaterialCost(tilesPrice, tilesCount);
        double sumCost = handWorkPrice + materialCost;

        double tilesNotBrokenTiles = countNotBroken(roomWidth, roomLength, tilesWidth, tilesLength);

        double tilesBrokenCount = tilesCount - tilesNotBrokenTiles;

        System.out.println("Программа расчёта плиток");
        System.out.println("Для комнаты площадью в " + roomArea + "метра и; со стоимостью плитки " + tilesPrice);
        System.out.println("Стоимость материала - " + materialCost + '€');
        System.out.println("Стоимость работ - " + handWorkPrice + '€');
        System.out.println("Итоговая стоимость - " + sumCost + '€');
        System.out.println("Всего потребуется плиток - " + tilesCount);
        System.out.println("Из них поломанных - " + tilesBrokenCount);
        System.out.println("-----");
        System.out.println("Если положить плитку по другому, то ");
        tilesCount = countTiles(roomLength, roomWidth, tilesWidth, tilesLength);
        tilesNotBrokenTiles = countNotBroken(roomLength, roomWidth, tilesWidth, tilesLength);
        tilesBrokenCount = tilesCount - tilesNotBrokenTiles;
        System.out.println("Всего потребуется плиток - " + tilesCount);
        System.out.println("Из них поломанных - " + tilesBrokenCount);
    }

    private static double countNotBroken(double width, double length, int tilesWidth, int tilesLength) {
        int countLineWidth = (int) Math.floor(width / tilesWidth);
        int countLineLength = (int) Math.floor(length / tilesLength);
        return countLineWidth * countLineLength;
    }


    private static int countTiles(double width, double length, int tilesWidth, int tilesLength) {
        int countLineWidth = (int) Math.ceil(width / tilesWidth);
        int countLineLength = (int) Math.ceil(length / tilesLength);
        return countLineWidth * countLineLength;
    }


    private static double getMeHandWorkPrice(double area) {
        return area * PRICE_PER_METER;
    }

    private static double getMeMaterialCost(double tilesPrice, int tilesCount) {
        return tilesCount * tilesPrice;
    }
}
