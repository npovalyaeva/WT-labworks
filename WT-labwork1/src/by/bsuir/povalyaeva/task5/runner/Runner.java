package by.bsuir.povalyaeva.task5.runner;

import by.bsuir.povalyaeva.DataScanner;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter length of array: ");
        int length = DataScanner.enterNaturalNumber();

        int[] numbers = new int[length];
        System.out.print("Enter elements of array: ");
        for (int index = 0; index < length; index++) {
            numbers[index] = DataScanner.enterIntegerNumber();
        }
        System.out.print("Min number of elements is : ");
    }
}
