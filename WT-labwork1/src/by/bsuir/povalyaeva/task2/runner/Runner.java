package by.bsuir.povalyaeva.task2.runner;

import by.bsuir.povalyaeva.DataScanner;
import by.bsuir.povalyaeva.task2.util.Util;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Please enter the coordinates of the point.\nx: ");
        double x = DataScanner.enterDoubleNumber();
        System.out.print("y: ");
        double y = DataScanner.enterDoubleNumber();
        System.out.print(Util.isInArea(x, y));
    }
}
