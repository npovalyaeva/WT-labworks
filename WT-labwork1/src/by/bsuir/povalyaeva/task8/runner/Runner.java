package by.bsuir.povalyaeva.task8.runner;

import static by.bsuir.povalyaeva.task8.util.Util.*;

public class Runner {
    public static void main(String[] args) {
        double[] arrayA = new double[]{0.5, 1, 1.5, 1.56, 1.9, 4, 7, 7.23, 9};
        double[] arrayB = new double[]{3, 4, 8, 8.001, 9, 10, 14, 17.453, 18, 31, 100};
        int[] positionsArray = findElementsPositions(arrayA, arrayB);
        for (int i : positionsArray)
            System.out.print(i + " ");
    }
}
