package by.bsuir.povalyaeva.task2.util;

public class Util {

    public static boolean isInArea(double x, double y) {
        return (((x <= 4 && x >= -4) && (y <= 5 && y >= 0)) || ((x <= 6 && x >= -6)&& (y <=0 && y >= -3))) ? true : false;
    }
}
