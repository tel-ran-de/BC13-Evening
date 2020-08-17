public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Spray cost" + getTotalAmount());
    }

    public static double getTotalAmount() {
        double sprayPrice = 7;
        int sprayValue = 400;
        int sqMeterValue = 160;
        double commonSurfaceArea = getCommonSurfaceArea();
        double amountOfPaint = commonSurfaceArea * sqMeterValue; // считаем кол во краски
        //Считаем кол-во баллончиков краски
        int numberOfSprays = (int) Math.ceil(amountOfPaint / sprayValue);

        return numberOfSprays * sprayPrice;
    }

    public static double getCommonSurfaceArea() {
        return getSurfaceAreaBlackBox() +
                getSurfaceAreaPyramid() +
                getSurfaceAreaCube() +
                getSurfaceAreaPS1();
    }

    public static double getSurfaceAreaPS1() {
        double diameter = 0.58;
        return 4 * Math.PI * Math.pow(diameter / 2, 2);
    }

    public static double getSurfaceAreaCube() {
        double side = 0.4;
        return 6 * side * side;
    }

    public static double getSurfaceAreaPyramid() {
        double base = 0.2;
        double edge = 0.3;
        return base + 4 * edge;
    }

    public static double getSurfaceAreaBlackBox() {
        double height = 0.8;
        double width = 0.3;
        double length = 0.2;
        return 2 * (height * width + width * length + length * height);
    }
}