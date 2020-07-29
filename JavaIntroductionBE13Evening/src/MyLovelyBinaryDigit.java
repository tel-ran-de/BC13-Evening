public class MyLovelyBinaryDigit {
    public static void main(String[] args) {
       // System.out.println(convertBinaryToDecimal(10));
        System.out.println(convertDecimalToBinary(79));
    }

    public static int convertBinaryToDecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0;
        while (binaryDigit > 0) {
            int temp = binaryDigit % 10;
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }
        return decimal;
    }

    public static String convertDecimalToBinary(int decimalDigit) {
        String output = "";
        int remainder;
        while (decimalDigit > 0) {
            remainder = decimalDigit % 2;
            output = remainder + output;
            decimalDigit = decimalDigit / 2;
        }
        return output;
    }
}
