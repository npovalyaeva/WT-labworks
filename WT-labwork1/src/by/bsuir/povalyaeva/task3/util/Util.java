package by.bsuir.povalyaeva.task3.util;

import by.bsuir.povalyaeva.DataScanner;

public class Util {

    public static void PrintTable(float a, float b, float h) {
        while (a <= b) {
            System.out.print(DataScanner.transformDoubleToUserFormat(a, "#.##") +
                    "    " + DataScanner.transformDoubleToUserFormat(Math.tan(a), "#.##") + "\n");
            a += h;
        }

    }
}
