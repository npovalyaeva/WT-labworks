package by.bsuir.povalyaeva.task1.runner;

import by.bsuir.povalyaeva.DataScanner;
import by.bsuir.povalyaeva.task1.util.Util;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = DataScanner.enterDoubleNumber();
        System.out.print("Enter y: ");
        double y = DataScanner.enterDoubleNumber();
        System.out.print(DataScanner.transformDoubleToUserFormat(Util.findExpressionValue(x, y), "#.##"));
    }
}
