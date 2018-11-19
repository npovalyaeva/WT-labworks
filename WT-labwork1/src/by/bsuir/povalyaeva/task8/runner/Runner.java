package by.bsuir.povalyaeva.task8.runner;

import by.bsuir.povalyaeva.DataScanner;

import static by.bsuir.povalyaeva.task8.util.Util.*;

public class Runner {
    public static void main(String[] args) {

        //double[] arrayA = new double[]{0.5, 1, 1.5, 1.56, 1.9, 4, 7, 7.23, 9};
        //double[] arrayB = new double[]{3, 4, 8, 8.001, 9, 10, 14, 17.453, 18, 31, 100};

        System.out.print("Enter length of array A: ");
        int length = DataScanner.enterNaturalNumber();
        double[] arrayA = new double[length];
        System.out.print("Enter elements of array A: ");
        for (int index = 0; index < length; index++)
            do
                arrayA[index] = DataScanner.enterDoubleNumber();
            while ((index != 0) ? (arrayA[index] < arrayA[index - 1]) : false);

        System.out.print("Enter length of array B: ");
        length = DataScanner.enterNaturalNumber();
        double[] arrayB = new double[length];
        System.out.print("Enter elements of array B: ");
        for (int index = 0; index < length; index++)
            do
                arrayB[index] = DataScanner.enterDoubleNumber();
            while ((index != 0) ? (arrayB[index] < arrayB[index - 1]) : false);

        int[] positionsArray = findElementsPositions(arrayA, arrayB);
        for (int i : positionsArray)
            System.out.print(i + " ");
    }
}
