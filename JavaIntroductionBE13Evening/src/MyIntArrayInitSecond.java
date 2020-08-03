public class MyIntArrayInitSecond {
    public static void main(String[] args) {
        int square = findSquare(5, 6);
        //System.out.println(square);
        int arrayRandomLength = (int) (Math.random() * 100);
        int[] magicArray = myFirstInit(arrayRandomLength);
        MyIntArrayInit.myIntArrayPrint(magicArray);

        int[] myInitTestArray1 = fillMyIntArray(magicArray);
        MyIntArrayInit.myIntArrayPrint(myInitTestArray1);
    }

    public static int[] fillMyIntArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        return myArray;
    }

    public static int[] myFirstInit(int n) {
        int[] array = new int[n];
        return array;
    }

    private static int findSquare(int a, int b) {
        return a * b;
    }
}
