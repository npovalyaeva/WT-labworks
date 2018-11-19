package by.bsuir.povalyaeva.task7.runner;

import by.bsuir.povalyaeva.DataScanner;
import by.bsuir.povalyaeva.task7.util.Util;

public class Runner {
    public static void main(String[] args) {

        System.out.print("Enter length of array: ");
        int length = DataScanner.enterNaturalNumber();
        double[] unsortedArray = new double[length];

        System.out.print("Enter elements of array: ");
        for (int index = 0; index < length; index++)
            unsortedArray[index] = DataScanner.enterDoubleNumber();

        double[] sortedArray = Util.sortByShell(unsortedArray);
        for (double i: sortedArray)
            System.out.print(DataScanner.transformDoubleToUserFormat(i, "#.###") + " ");
    }
}
