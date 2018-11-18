package by.bsuir.povalyaeva.task8.util;

public class Util {

    public static int[] findElementsPositions(double[] arrayA, double[] arrayB) {
        int[] positionsArray = new int[arrayB.length];
        int i = 0, j = 0, k = 0;
        int numOfAdded = 0;

        while ((i < arrayA.length) && (j < arrayB.length)) {
            if (arrayA[i] >= arrayB[j]) {
                positionsArray[k++] = i + numOfAdded;
                j++;
                numOfAdded++;
            } else
                i++;
        }
        while (j < arrayB.length) {
            j++;
            positionsArray[k++] = i + numOfAdded;
            numOfAdded++;
        }
        return positionsArray;
    }
}
