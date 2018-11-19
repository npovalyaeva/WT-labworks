package by.bsuir.povalyaeva.task6.runner;

import by.bsuir.povalyaeva.DataScanner;
import by.bsuir.povalyaeva.task6.util.Util;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //List<Double> userNumbersList = new ArrayList<Double>();

        System.out.print("Enter length of array: ");
        int length = DataScanner.enterNaturalNumber();

        double[] numbers = new double[length];
        System.out.print("Enter elements of array: ");
        for (int index = 0; index < length; index++) {
            numbers[index] = DataScanner.enterDoubleNumber();
        }

        System.out.println("Square matrix:");
        double[][] matrix = new double[length][length];
        System.out.print(Util.getSquareMatrix(numbers));

    }
}
