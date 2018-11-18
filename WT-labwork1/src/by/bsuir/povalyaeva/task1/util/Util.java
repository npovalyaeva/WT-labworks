package by.bsuir.povalyaeva.task1.util;

public class Util {
    public static double findExpressionValue(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x / (1 + Math.pow(x * y, 2))));
        return numerator / denominator + x;
    }
}
