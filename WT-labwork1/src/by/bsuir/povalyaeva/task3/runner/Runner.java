package by.bsuir.povalyaeva.task3.runner;

import by.bsuir.povalyaeva.DataScanner;
import by.bsuir.povalyaeva.task3.util.Util;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        float a = DataScanner.enterFloatNumber();
        System.out.print("Enter b: ");
        float b = DataScanner.enterFloatNumber();
        System.out.print("Enter h: ");
        float h = DataScanner.enterFloatNumber();
        Util.PrintTable(a, b, h);
    }
}
